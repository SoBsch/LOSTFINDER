package lostfinder.sobsch.lostfinder.ui.login

import kotlinx.android.synthetic.main.activity_login.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.register.Register
import org.jetbrains.anko.intentFor


class Login : BaseActivity<LoginContract.View, LoginContract.Presenter>() {

    override var mPresenter: LoginContract.Presenter = LoginPresenter()

    override fun getResID(): Int = R.layout.activity_login

    override fun init() {

        login_register.setOnClickListener { startActivity(intentFor<Register>()) }

    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }


}