package lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera

import kotlinx.android.synthetic.main.stuff_camera.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener


class StuffCamera : BaseFragment<StuffCameraContract.View, StuffCameraContract.Presenter>(), StuffCameraContract.View {

    override var mPresenter: StuffCameraContract.Presenter = StuffCameraPresenter()

    override fun getResId(): Int = R.layout.stuff_camera

    private lateinit var mCallback: StuffEventListener

    override fun init() {


        //TODO 카메라 넣기
        stuff_camera_shot.setOnClickListener { mCallback.onWrite() }

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun attach() {

        try {
            mCallback = activity as StuffEventListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

}