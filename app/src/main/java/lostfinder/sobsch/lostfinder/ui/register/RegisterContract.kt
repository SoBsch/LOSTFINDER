package lostfinder.sobsch.lostfinder.ui.register

import android.content.Context
import android.support.v4.app.FragmentManager
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface RegisterContract {

    interface View : BaseView {

        fun logo(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun getSupportFragmentManager(fm: FragmentManager)

        fun popBackStack()

        fun mainFragment()  // 첫 화면
        fun accentFragment() // 약관 동의 화면
        fun certificationFragment() // 본인 인증
        fun signinUserFragment()    // 아이디 입력
        fun signinAddressFragment() // 주소입력
        fun doneFragment()    // 완료

        fun loadImage(context: Context)

    }
}