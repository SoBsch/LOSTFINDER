package lostfinder.sobsch.lostfinder.ui.findstuff

import android.app.Activity
import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface FindStuffContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

        fun getSupportFragmentManager(fm: FragmentManager)

        fun popBackStack()

        fun nfcScan()

        fun onLoadCamera(activity: Activity)

        fun onMode()
    }

    interface FragmentCallbackListener{

        fun onCamera()

        fun onMode()

    }
}