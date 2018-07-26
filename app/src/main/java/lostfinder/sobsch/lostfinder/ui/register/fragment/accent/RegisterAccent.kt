package lostfinder.sobsch.lostfinder.ui.register.fragment.accent

import kotlinx.android.synthetic.main.register_accent.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterAccent : BaseFragment<RegisterAccentContract.View, RegisterAccentContract.Presenter>(), RegisterAccentContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterAccentContract.Presenter = RegisterAccentPresenter()

    override fun getResId(): Int = R.layout.register_accent

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_accent_submit.setOnClickListener { mCallback.onCertification() }
        register_accent_back.setOnClickListener { mCallback.popBack() }
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

}
