package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface RegisterCertificationContract {

    interface View : BaseView {

        fun toastMessage(msg: String)

    }

    interface Presenter : BasePresenter<View> {

        fun checkNotEmptyEditText(name: String, number: String): Boolean

    }
}