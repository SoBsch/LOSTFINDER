package lostfinder.sobsch.lostfinder.ui.register.fragment.signin

import android.content.Context
import android.support.design.widget.TextInputEditText
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

interface RegisterSignInUserContract {

    interface View : BaseView {

        fun userId(): TextInputEditText

        fun userPassword(): TextInputEditText

        fun userCheckPassword(): TextInputEditText
    }

    interface Presenter : BasePresenter<View> {

        fun validateUserId()


        fun submitSignIn(mCallback: RegisterEventListenter, context: Context)

    }
}