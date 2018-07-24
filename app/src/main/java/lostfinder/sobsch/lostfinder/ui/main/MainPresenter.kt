package lostfinder.sobsch.lostfinder.ui.main

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl

class MainPresenter : BasePresenterImpl<MainContract.View>(), MainContract.Presenter {

    override fun setSupportActionBar(actionBar: android.support.v7.app.ActionBar?) {
        actionBar?.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}