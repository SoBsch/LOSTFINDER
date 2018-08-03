package lostfinder.sobsch.lostfinder.ui.stuff

import android.app.Activity
import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface StuffContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

        fun getSupportFragmentManager(fm: FragmentManager)

        fun popBackStack()

        fun nfcScan()

        fun onLoadCamera(activity: Activity)

        fun onLoadWrite(activity: Activity)
    }
}