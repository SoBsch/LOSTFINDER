package lostfinder.sobsch.lostfinder.ui.register

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v4.content.ContextCompat
import android.util.Log
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

    private var name: String? = null
    private var phone: String? = null
    private var userId: String? = null
    private var userPW: String? = null

    private var currentBackgroundColor = R.color.login_background

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun popBackStack(context: Context) {

        supportFragmentMananger.popBackStack()

        if (currentBackgroundColor == R.color.white) {  // background color change
            currentBackgroundColor = R.color.login_background
            changeBackgroundColor(currentBackgroundColor, context)
        }
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

    override fun signinUserFragment(name: String?, phone: String?) {

        if (name?.isNotEmpty()!! && phone?.isNotEmpty()!!) {
            this.name = name
            this.phone = phone
        }
        Log.e("name & phone", "${this.name}  ${this.phone}")
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterSignInUser())
                .addToBackStack(null)
                .commit()
    }

    override fun signinAddressFragment(id: String, pw: String) {

        this.userId = id
        this.userPW = pw

        Log.e("id, pw", "$userId   $userPW")

        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterSignInAddress())
                .addToBackStack(null)
                .commit()
    }

    override fun doneFragment(context: Context) {

        currentBackgroundColor = R.color.white
        changeBackgroundColor(R.color.white, context)

        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterDone())
                .addToBackStack(null)
                .commit()
    }

    override fun loadImage(context: Context) {
        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }

    private fun changeBackgroundColor(color: Int, context: Context) =
            mView!!.mainContainer().setBackgroundColor(ContextCompat.getColor(context, color))
}