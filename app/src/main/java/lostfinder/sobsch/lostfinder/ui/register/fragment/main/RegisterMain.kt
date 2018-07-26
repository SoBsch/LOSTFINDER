package lostfinder.sobsch.lostfinder.ui.register.fragment.main

import kotlinx.android.synthetic.main.register_main.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterMain : BaseFragment<RegisterMainContract.View, RegisterMainContract.Presenter>(), RegisterMainContract.View {

    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterMainContract.Presenter = RegisterMainPresenter()

    override fun getResId(): Int = R.layout.register_main

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }

    }

    override fun init() {

        register_main_submit.setOnClickListener { mCallback.onAccent() }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }


}