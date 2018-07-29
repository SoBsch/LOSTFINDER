package lostfinder.sobsch.lostfinder.ui.register.fragment.main

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface RegisterMainContract {

    interface View : BaseView {

        fun personImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImage(context: Context)
    }
}