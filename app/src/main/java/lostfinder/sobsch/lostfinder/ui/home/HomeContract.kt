package lostfinder.sobsch.lostfinder.ui.home

import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface HomeContract {

    interface View : BaseView {

        fun presentImage(): ImageView

        fun messageImage(): ImageView

        fun yourImage(): ImageView

        fun imageSlider(): ViewPager

        fun indicatorContainer(): TabLayout

    }

    interface Presenter : BasePresenter<View> {

        fun loadMainSliderItems(context: Context)

        fun loadImages(context: Context)
    }
}