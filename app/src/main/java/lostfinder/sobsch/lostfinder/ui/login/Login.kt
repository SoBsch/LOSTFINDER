package lostfinder.sobsch.lostfinder.ui.login

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity


class Login : BaseActivity<LoginContract.View, LoginContract.Presenter>() {

    override var mPresenter: LoginContract.Presenter = LoginPresenter()

    override fun getResID(): Int = R.layout.activity_login

    override fun init() {

    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }

}