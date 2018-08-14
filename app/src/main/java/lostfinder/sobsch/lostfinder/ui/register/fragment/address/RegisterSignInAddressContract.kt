package lostfinder.sobsch.lostfinder.ui.register.fragment.address

import android.content.Context
import android.widget.EditText
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

interface RegisterSignInAddressContract {

    interface View : BaseView {

        fun nickname(): EditText

        fun email(): EditText

        fun address(): EditText

        fun otherAddress(): EditText
    }

    interface Presenter : BasePresenter<View> {

        fun submitAddress(mCallback: RegisterEventListenter, context: Context)
    }
}