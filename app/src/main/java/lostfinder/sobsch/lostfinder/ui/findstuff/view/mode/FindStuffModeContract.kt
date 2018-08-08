package lostfinder.sobsch.lostfinder.ui.findstuff.view.mode

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract

interface FindStuffModeContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

        fun openDirect(context: Context, isDirectOpen: FindStuffContract.FragmentCallbackListener)

        fun openMessage(context: Context, isMessageOpen: FindStuffContract.FragmentCallbackListener)
    }
}