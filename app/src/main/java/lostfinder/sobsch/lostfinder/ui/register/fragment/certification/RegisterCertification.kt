package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import android.widget.Toast
import kotlinx.android.synthetic.main.register_certification.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterCertification : BaseFragment<RegisterCertificationContract.View, RegisterCertificationContract.Presenter>(),
        RegisterCertificationContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterCertificationContract.Presenter = RegisterCertificationPresenter()

    override fun getResId(): Int = R.layout.register_certification

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_certification_submit.setOnClickListener { submitCertification() }

        register_certification_back.setOnClickListener { mCallback.popBack() }
    }


    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }

    override fun toastMessage(msg: String) = Toast.makeText(context!!, msg, Toast.LENGTH_SHORT).show()

    private fun submitCertification() {

        val name = register_certification_name.text.toString()
        val phoneNumber = register_certification_tel.text.toString()

        if (mPresenter.checkNotEmptyEditText(name, phoneNumber)) mCallback.onSignInUser()
    }

}