package lostfinder.sobsch.lostfinder.ui.register

import android.content.Context
import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.fragment.accent.RegisterAccent
import lostfinder.sobsch.lostfinder.ui.register.fragment.address.RegisterSignInAddress
import lostfinder.sobsch.lostfinder.ui.register.fragment.certification.RegisterCertification
import lostfinder.sobsch.lostfinder.ui.register.fragment.done.RegisterDone
import lostfinder.sobsch.lostfinder.ui.register.fragment.main.RegisterMain
import lostfinder.sobsch.lostfinder.ui.register.fragment.signin.RegisterSignInUser
import lostfinder.sobsch.lostfinder.util.ImageUtil

class RegisterPresenter : BasePresenterImpl<RegisterContract.View>(), RegisterContract.Presenter {

    private lateinit var supportFragmentMananger: FragmentManager

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun popBackStack() {
        supportFragmentMananger.popBackStack()
    }

    override fun mainFragment() {
        supportFragmentMananger.beginTransaction()
                .add(R.id.register_container, RegisterMain())
                .commit()
    }

    override fun accentFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterAccent())
                .addToBackStack(null)
                .commit()
    }

    override fun certificationFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterCertification())
                .addToBackStack(null)
                .commit()
    }

    override fun signinUserFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterSignInUser())
                .addToBackStack(null)
                .commit()
    }

    override fun signinAddressFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterSignInAddress())
                .addToBackStack(null)
                .commit()
    }

    override fun doneFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterDone())
                .addToBackStack(null)
                .commit()
    }

    override fun loadImage(context: Context) {
        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }
}