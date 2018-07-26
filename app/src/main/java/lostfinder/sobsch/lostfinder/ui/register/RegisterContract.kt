package lostfinder.sobsch.lostfinder.ui.register

import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface RegisterContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

        fun getSupportFragmentManager(fm: FragmentManager)

        fun mainFragment()
    }
}