package lostfinder.sobsch.lostfinder.ui.register.fragment.address

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterSignInAddress : BaseFragment<RegisterSignInAddressContract.View, RegisterSignInAddressContract.Presenter>(),
        RegisterSignInAddressContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterSignInAddressContract.Presenter = RegisterSignInAddressPresenter()

    override fun getResId(): Int = R.layout.register_signin_address

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }

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