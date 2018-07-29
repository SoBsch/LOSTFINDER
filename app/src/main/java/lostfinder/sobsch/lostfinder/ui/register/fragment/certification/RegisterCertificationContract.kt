package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface RegisterCertificationContract {

    interface View : BaseView {

        fun phoneLogo(): ImageView
        fun ipinLogo(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImage(context: Context)
    }
}