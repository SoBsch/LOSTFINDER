package lostfinder.sobsch.lostfinder.ui.login

import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_login.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.findID.FindID
import lostfinder.sobsch.lostfinder.ui.findPassword.FindPassword
import lostfinder.sobsch.lostfinder.ui.main.MainActivity
import lostfinder.sobsch.lostfinder.ui.register.Register
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

        //TODO 아이디 비밀번호 체크
        login_submit.setOnClickListener { startActivity(intentFor<MainActivity>()).apply { finish() } }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }


}