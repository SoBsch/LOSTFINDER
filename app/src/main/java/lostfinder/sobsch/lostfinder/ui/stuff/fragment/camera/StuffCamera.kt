package lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera

import android.widget.FrameLayout
import kotlinx.android.synthetic.main.stuff_camera.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener


class StuffCamera : BaseFragment<StuffCameraContract.View, StuffCameraContract.Presenter>(), StuffCameraContract.View {

    private lateinit var mCallback: StuffEventListener

    override var mPresenter: StuffCameraContract.Presenter = StuffCameraPresenter()

    override fun getResId(): Int = R.layout.stuff_camera

    override fun cameraPreview(): FrameLayout = stuff_camera_surfaceview

    override fun attach() {

        try {
            mCallback = activity as StuffEventListener
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
        mCallback.onWrite(path)
    }
}