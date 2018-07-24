package lostfinder.sobsch.lostfinder.ui.main

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface MainContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

        fun setSupportActionBar(actionBar: android.support.v7.app.ActionBar?)
    }
}