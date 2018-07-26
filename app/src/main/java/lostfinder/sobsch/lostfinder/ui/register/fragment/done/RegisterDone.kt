package lostfinder.sobsch.lostfinder.ui.register.fragment.done

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

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

        // TODO 로그인하기 버튼 클릭 시 액티비티 종료

    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }


}