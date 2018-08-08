package lostfinder.sobsch.lostfinder.ui.findstuff.view.camera

import android.app.Activity
import android.content.Context
import android.hardware.Camera
import android.os.Build
import android.support.annotation.RequiresApi
import android.widget.Toast
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.CameraUtils
import lostfinder.sobsch.lostfinder.util.PermissionUtil
import lostfinder.sobsch.lostfinder.util.preview.CameraPreview
import lostfinder.sobsch.lostfinder.util.preview.CameraPreviewListener

class FindStuffCameraPresenter : BasePresenterImpl<FindStuffCameraContract.View>(),
        FindStuffCameraContract.Presenter, Camera.PictureCallback, CameraPreviewListener.PreviewFileListener {

    private var preview: CameraPreview? = null

    private var camera: Camera? = null

    override fun camera(): Camera? = camera

    companion object {

        private const val CAMERA_ID = 0

        fun newInstance(): FindStuffCameraPresenter = FindStuffCameraPresenter()

        fun getCameraInstance(cameraId: Int): Camera? = try {
            Camera.open(cameraId)
        } catch (e: Exception) {
            null
        }
    }

    // permission check
    @RequiresApi(Build.VERSION_CODES.M)
    override fun getCameraPermission(context: Context, activity: Activity) {

        PermissionUtil.CameraPermission(context, activity).isPermissionGranted() {

            if (it) {
                initCamera(activity, context)
            } else {
                Toast.makeText(context, "권한을 허용해 주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun initCamera(activity: Activity, context: Context) {

        camera = FindStuffCameraPresenter.getCameraInstance(FindStuffCameraPresenter.CAMERA_ID)?.also { camera ->

            val cameraInfo = Camera.CameraInfo().also { Camera.getCameraInfo(FindStuffCameraPresenter.CAMERA_ID, it) }
            val displayRotation = activity.windowManager?.defaultDisplay?.rotation

            mView!!.cameraPreview().removeAllViews()

            if (displayRotation == null) {
                return@also
            }
            preview?.setCamera(camera, cameraInfo, displayRotation) ?: run {

                context.let {
                    preview = CameraPreview(it, camera, cameraInfo, displayRotation)
                }
            }
            mView!!.cameraPreview().addView(preview)
        }
    }

    override fun releaseCamera() {
        camera?.release()?.run { camera = null }
        preview = null
    }

    override fun onPictureTaken(data: ByteArray?, camera: Camera?) {
        CameraUtils.picktureTaken(data, camera, this)
    }

    override fun takePickture() {
        camera!!.takePicture(null, null, this)
    }

    override fun onFileWriteFinish(path: String) {
        mView!!.isImageWriteFinish(path)
    }
}