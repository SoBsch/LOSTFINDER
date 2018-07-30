package lostfinder.sobsch.lostfinder.ui.home

import android.content.Context
import android.media.Image
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface HomeContract {

    interface View : BaseView {

        fun presentImage(): ImageView
        fun messageImage(): ImageView
        fun yourImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImages(context: Context)
    }
}