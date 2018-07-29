package lostfinder.sobsch.lostfinder.ui.register.fragment.done

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import kotlinx.android.synthetic.main.register_done.*

class RegisterDone : BaseFragment<RegisterDoneContract.View, RegisterDoneContract.Presenter>(), RegisterDoneContract.View {


    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterDoneContract.Presenter = RegisterDonePresenter()

    override fun getResId(): Int = R.layout.register_done

    override fun attach() {
        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_done_submit.setOnClickListener { mCallback.onRegisterFinish() }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }


}