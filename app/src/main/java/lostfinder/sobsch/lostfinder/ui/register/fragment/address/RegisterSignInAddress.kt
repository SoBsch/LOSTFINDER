package lostfinder.sobsch.lostfinder.ui.register.fragment.address

import android.widget.EditText
import kotlinx.android.synthetic.main.register_signin_address.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.findAddress.FindAddressActivity
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import org.jetbrains.anko.support.v4.intentFor

class RegisterSignInAddress : BaseFragment<RegisterSignInAddressContract.View, RegisterSignInAddressContract.Presenter>(),
        RegisterSignInAddressContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterSignInAddressContract.Presenter = RegisterSignInAddressPresenter()

    override fun getResId(): Int = R.layout.register_signin_address

    override fun nickname(): EditText = register_signin_address_nickname

    override fun email(): EditText = register_signin_address_email

    override fun address(): EditText = register_signin_address_address

    override fun otherAddress(): EditText = register_signin_other_address

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_signin_address_find.setOnClickListener { context?.startActivity(intentFor<FindAddressActivity>()) }

        register_signin_address_submit.setOnClickListener { mPresenter.submitAddress(mCallback, context!!) }

        register_signin_address_back.setOnClickListener { mCallback.popBack() }
    }

    override fun resume() {

    }


    override fun pause() {

    }

    override fun stop() {

    }
}