package lostfinder.sobsch.lostfinder.ui.register.fragment.main

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class RegisterMain: BaseFragment<RegisterMainContract.View, RegisterMainContract.Presenter>(), RegisterMainContract.View{
    override var mPresenter: RegisterMainContract.Presenter = RegisterMainPresenter()

    override fun getResId(): Int = R.layout.register_main

    override fun init() {
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }


}