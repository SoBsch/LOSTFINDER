package lostfinder.sobsch.lostfinder.ui.near

import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface NearContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

        fun getSupportFragmentManager(fm: FragmentManager)
        fun loadNaverMap()
    }

}