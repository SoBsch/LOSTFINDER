package lostfinder.sobsch.lostfinder.ui.register.fragment.accent

import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.register_accent.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.accentInfo.AccentInfoActivity
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import org.jetbrains.anko.support.v4.intentFor

class RegisterAccent : BaseFragment<RegisterAccentContract.View, RegisterAccentContract.Presenter>(), RegisterAccentContract.View {


    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterAccentContract.Presenter = RegisterAccentPresenter()

    override fun getResId(): Int = R.layout.register_accent

    override fun serviceCheckBox(): CheckBox = register_accent_service_check

    override fun privacyCheckBox(): CheckBox = register_accent_privacy_check

    override fun accentAllCheckBox(): CheckBox = register_accent_all

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_accent_all.setOnClickListener { mPresenter.checkAllEvent() }
        register_accent_privacy_check.setOnClickListener { mPresenter.checkBoxStatus() }
        register_accent_service_check.setOnClickListener { mPresenter.checkBoxStatus() }

        register_accent_submit.setOnClickListener { mPresenter.validateCheckedAll(mCallback) }
        register_accent_back.setOnClickListener { mCallback.popBack() }

        register_accent_service_view.setOnClickListener { context!!.startActivity(intentFor<AccentInfoActivity>()) }
        register_accent_privacy_view.setOnClickListener { context!!.startActivity(intentFor<AccentInfoActivity>()) }
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun toastMessage(message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

}
