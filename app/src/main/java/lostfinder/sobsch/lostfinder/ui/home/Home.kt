package lostfinder.sobsch.lostfinder.ui.home

import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
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

    override fun imageSlider(): ViewPager = home_viewpager

    override fun indicatorContainer(): TabLayout = home_indicator_container

    override fun init() {

        mPresenter.loadMainSliderItems(context!!)
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