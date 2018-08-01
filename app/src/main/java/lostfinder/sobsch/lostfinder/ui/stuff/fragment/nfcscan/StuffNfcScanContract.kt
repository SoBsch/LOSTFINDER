package lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan

import android.content.Context
import android.support.v4.app.FragmentManager
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView


interface StuffNfcScanContract {

    interface View : BaseView {

        fun nfcImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImage(context: Context)


    }
}