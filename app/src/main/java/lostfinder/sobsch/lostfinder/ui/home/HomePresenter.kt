package lostfinder.sobsch.lostfinder.ui.home

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.adapter.MainImageSlider
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class HomePresenter : BasePresenterImpl<HomeContract.View>(), HomeContract.Presenter {

    override fun loadMainSliderItems(context: Context) {
        // TODO 서버에서 메인 슬라이드 아이템 받아와 Adapter에 전달 해야됨

        /* dummy*/
        val items: MutableList<String> = ArrayList()
        for (a in 0..3) {
            items.add("")
        }
        /* dummy done*/

        mView!!.imageSlider().adapter = MainImageSlider(context, items)

        // indocator
        mView!!.indicatorContainer().setupWithViewPager(mView!!.imageSlider(), true)

    }

    override fun loadImages(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.presentImage(), R.drawable.home_present, context)

        ImageUtil.squareDrawableImage(mView!!.messageImage(), R.drawable.show_me_your_heart, context)

        ImageUtil.squareDrawableImage(mView!!.yourImage(), R.drawable.home_text, context)
    }
}