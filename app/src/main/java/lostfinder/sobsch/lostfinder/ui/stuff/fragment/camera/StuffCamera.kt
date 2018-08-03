package lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class StuffCamera : BaseFragment<StuffCameraContract.View, StuffCameraContract.Presenter>(), StuffCameraContract.View {

    override var mPresenter: StuffCameraContract.Presenter = StuffCameraPresenter()

    override fun getResId(): Int = R.layout.stuff_camera

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun attach() {

    }

}