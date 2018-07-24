package lostfinder.sobsch.lostfinder.ui.home

import android.util.Log
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class Home : BaseFragment<HomeContract.View, HomeContract.Presenter>(), HomeContract.View {

    override var mPresenter: HomeContract.Presenter = HomePresenter()

    override fun getResId(): Int = R.layout.fragment_home

    override fun init() {
        Log.e("home", "home")
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }


}