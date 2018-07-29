package lostfinder.sobsch.lostfinder.ui.findID

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface FindIDContract{

    interface View: BaseView {

        fun logo(): ImageView
    }

    interface Presenter: BasePresenter<View>{

        fun loadImage(context: Context)

    }
}