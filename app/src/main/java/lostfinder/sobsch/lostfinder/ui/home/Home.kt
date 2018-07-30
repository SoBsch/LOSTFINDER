package lostfinder.sobsch.lostfinder.ui.home

import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_home.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class Home : BaseFragment<HomeContract.View, HomeContract.Presenter>(), HomeContract.View {

    override var mPresenter: HomeContract.Presenter = HomePresenter()

    override fun getResId(): Int = R.layout.fragment_home

    override fun presentImage(): ImageView = home_present
    override fun messageImage(): ImageView = home_message
    override fun yourImage(): ImageView = home_text

    override fun init() {

        mPresenter.loadImages(context!!)

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun attach() {

    }


}