package lostfinder.sobsch.lostfinder.ui.findstuff.view.camera

import android.widget.FrameLayout
import kotlinx.android.synthetic.main.stuff_camera.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract

class FindStuffCamera : BaseFragment<FindStuffCameraContract.View, FindStuffCameraContract.Presenter>(),
        FindStuffCameraContract.View {

    private lateinit var mCallback: FindStuffContract.FragmentCallbackListener

    override var mPresenter: FindStuffCameraContract.Presenter = FindStuffCameraPresenter()

    override fun getResId(): Int = R.layout.stuff_camera

    override fun cameraPreview(): FrameLayout = stuff_camera_surfaceview

    override fun attach() {

        try {
            mCallback = activity as FindStuffContract.FragmentCallbackListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        mPresenter.getCameraPermission(context!!, activity!!)

        stuff_camera_shot.setOnClickListener { mPresenter.takePickture() }
    }

    override fun resume() {
        mPresenter.camera() ?: mPresenter.initCamera(activity!!, context!!)
    }

    override fun pause() {
        mPresenter.releaseCamera()
    }

    override fun stop() {

    }

    override fun isImageWriteFinish(path: String) {
        mCallback.onMode()
    }


}