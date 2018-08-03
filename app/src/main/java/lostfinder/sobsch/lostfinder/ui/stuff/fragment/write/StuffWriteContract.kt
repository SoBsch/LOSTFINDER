package lostfinder.sobsch.lostfinder.ui.stuff.fragment.write

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener

interface StuffWriteContract {

    interface View : BaseView {

        fun stuffImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImage(context: Context, images: String)
        fun uploadStuff(context: Context, mCallback: StuffEventListener)
    }
}