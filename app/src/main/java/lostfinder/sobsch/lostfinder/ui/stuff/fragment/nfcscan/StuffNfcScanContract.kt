package lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener


interface StuffNfcScanContract {

    interface View : BaseView {

        fun nfcImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun loadImage(context: Context)

        fun setNfcAdapter(context: Context)

        fun isValidNFC(): Boolean

        fun nfcSuccess(context: Context, isCameraOpen: StuffEventListener)
    }
}