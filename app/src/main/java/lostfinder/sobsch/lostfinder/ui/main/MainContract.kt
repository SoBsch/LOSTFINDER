package lostfinder.sobsch.lostfinder.ui.main

import android.content.Context
import android.support.design.widget.NavigationView
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface MainContract {

    interface View : BaseView {

        fun profileImage(): ImageView

    }

    interface Presenter : BasePresenter<View> {

        fun setSupportActionBar(actionBar: android.support.v7.app.ActionBar?)

        fun loadNavigationItems(context: Context)
    }
}