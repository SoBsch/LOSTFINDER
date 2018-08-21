package lostfinder.sobsch.lostfinder.ui.login

import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_login.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.findID.FindID
import lostfinder.sobsch.lostfinder.ui.findPassword.FindPassword
import lostfinder.sobsch.lostfinder.ui.main.MainActivity
import lostfinder.sobsch.lostfinder.ui.register.Register
import lostfinder.sobsch.lostfinder.util.UIUtils
import org.jetbrains.anko.intentFor


class Login : BaseActivity<LoginContract.View, LoginContract.Presenter>(), LoginContract.View {

    override var mPresenter: LoginContract.Presenter = LoginPresenter()

    override fun getResID(): Int = R.layout.activity_login

    override fun logo(): ImageView = login_logo

    override fun init() {

        mPresenter.loadImage(this)

        clickEvent()
    }

    private fun clickEvent() {

        login_register.setOnClickListener { startActivity(intentFor<Register>()) }

        login_find_id.setOnClickListener { startActivity(intentFor<FindID>()) }
        login_find_password.setOnClickListener { startActivity(intentFor<FindPassword>()) }


        login_submit.setOnClickListener { mPresenter.submitLogin(login_id.text.toString(), login_password.text.toString()) }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }

    override fun intentMain() = startActivity(intentFor<MainActivity>()).apply { finish() }

    override fun toastMessage(message: String) = UIUtils.toastMessage(message, this)
}