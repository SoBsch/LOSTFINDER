package lostfinder.sobsch.lostfinder.ui.register.fragment.accent

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class RegisterAccent : BaseFragment<RegisterAccentContract.View, RegisterAccentContract.Presenter>(), RegisterAccentContract.View {

    override var mPresenter: RegisterAccentContract.Presenter = RegisterAccentPresenter()

    override fun getResId(): Int = R.layout.register_accent

    override fun attach() {

    }

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

}
