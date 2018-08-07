package lostfinder.sobsch.lostfinder.ui.findstuff.view.nfc

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener

interface FindStuffNFCContract{

    interface View: BaseView{

        fun titleText(): TextView

        fun nfcImage(): ImageView
    }

    interface Presenter: BasePresenter<View> {

        fun setTitle(title: String)

        fun loadImage(context: Context)

        fun nfcSuccess(context: Context, isCameraOpen: FindStuffContract.FragmentCallbackListener)
    }
}