package lostfinder.sobsch.lostfinder.ui.register.fragment.accent

import android.widget.CheckBox
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

interface RegisterAccentContract {

    interface View : BaseView {

        fun toastMessage(message: String)

        // 체크박스
        fun serviceCheckBox(): CheckBox

        fun privacyCheckBox(): CheckBox
        fun accentAllCheckBox(): CheckBox
    }

    interface Presenter : BasePresenter<View> {

        // 약관동의 유효성 검사
        fun validateCheckedAll(mCallback: RegisterEventListenter)

        fun checkAllEvent()

        fun checkBoxStatus()

    }
}