package lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera.preview

import android.annotation.SuppressLint
import android.content.Context
import android.hardware.Camera
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import java.io.IOException
import kotlin.properties.Delegates

@SuppressLint("ViewConstructor")
class CameraPreview(context: Context, camera: Camera, cameraInfo: Camera.CameraInfo, displayOrientation: Int)
    : SurfaceView(context), SurfaceHolder.Callback, CameraPreviewListener {

    private val mHolder: SurfaceHolder

    private var mCamera: Camera by Delegates.notNull()

    private var mCameraInfo: Camera.CameraInfo by Delegates.notNull()

    private var mDisplayOrientation: Int = 0

    init {

        setCamera(camera, cameraInfo, displayOrientation)

        mHolder = holder
        mHolder.addCallback(this)
    }

    override fun surfaceCreated(holder: SurfaceHolder) {

        try {

            mCamera.setPreviewDisplay(holder)
            mCamera.startPreview()

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, w: Int, h: Int) {

        mHolder.takeIf { it.surface != null }?.let {

            try {
                mCamera.stopPreview()

            } catch (e: Exception) {
                e.printStackTrace()
            }

            val orientation = calculatePreviewOrientation(mCameraInfo, mDisplayOrientation)
            mCamera.setDisplayOrientation(orientation)

            try {
                mCamera.setPreviewDisplay(it)
                mCamera.startPreview()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        } ?: let {

        }
    }

    override fun setCamera(camera: Camera, cameraInfo: Camera.CameraInfo, displayOrientation: Int) {
        mCamera = camera
        mCameraInfo = cameraInfo
        mDisplayOrientation = displayOrientation
    }

    companion object {

        fun calculatePreviewOrientation(info: Camera.CameraInfo, rotation: Int) = when {
            info.facing == Camera.CameraInfo.CAMERA_FACING_FRONT ->

                (360 - (info.orientation + degrees(rotation)) % 360) % 360
            else -> (info.orientation - degrees(rotation) + 360) % 360
        }

        private fun degrees(rotation: Int) = when (rotation) {
            Surface.ROTATION_90 -> 90
            Surface.ROTATION_180 -> 180
            Surface.ROTATION_270 -> 270
            else -> 0
        }
    }
}