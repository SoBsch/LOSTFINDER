package lostfinder.sobsch.lostfinder.ui.register

import android.support.constraint.ConstraintLayout
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_register.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.R.id.register_logo
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class Register : BaseFragmentActivity<RegisterContract.View, RegisterContract.Presenter>(), RegisterContract.View, RegisterEventListenter {

    override var mPresenter: RegisterContract.Presenter = RegisterPresenter()

    override fun getResID(): Int = R.layout.activity_register

    override fun logo(): ImageView = register_logo

    override fun mainContainer(): ConstraintLayout = register_layout

    override fun init() {

        mPresenter.loadImage(this)

        mPresenter.getSupportFragmentManager(supportFragmentManager)
        mPresenter.mainFragment()

        register_back.setOnClickListener { popBack() }
    }

    override fun resume() {

    }

    override fun pause() {
    }


    override fun destroy() {
    }

    override fun onAccent() = mPresenter.accentFragment()

    override fun onCertification() = mPresenter.certificationFragment()

    override fun onSignInUser(name: String?, phone: String?) = mPresenter.signinUserFragment(name, phone)

    override fun onSignInAddress(id: String, pw: String) = mPresenter.signinAddressFragment(id, pw)

    override fun onRegisterDone() = mPresenter.doneFragment(this)

    override fun onRegisterFinish() {
        finish()
    }

    override fun popBack() = mPresenter.popBackStack(this)


}