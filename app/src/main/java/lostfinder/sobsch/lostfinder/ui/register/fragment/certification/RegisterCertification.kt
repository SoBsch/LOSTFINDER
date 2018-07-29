package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import android.widget.ImageView
import kotlinx.android.synthetic.main.certification_ipin.*
import kotlinx.android.synthetic.main.certification_phone.*
import kotlinx.android.synthetic.main.register_certification.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterCertification : BaseFragment<RegisterCertificationContract.View, RegisterCertificationContract.Presenter>(),
        RegisterCertificationContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterCertificationContract.Presenter = RegisterCertificationPresenter()

    override fun getResId(): Int = R.layout.register_certification

    override fun phoneLogo(): ImageView = register_certification_phone
    override fun ipinLogo(): ImageView = register_certification_ipin


    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        mPresenter.loadImage(context!!)

        register_certification_submit.setOnClickListener { mCallback.onSignInUser() }
        register_certification_back.setOnClickListener { mCallback.popBack() }
    }


    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }


}