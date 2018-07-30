package lostfinder.sobsch.lostfinder.ui.home

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class HomePresenter : BasePresenterImpl<HomeContract.View>(), HomeContract.Presenter {

    override fun loadImages(context: Context) {
        ImageUtil.squareDrawableImage(mView!!.presentImage(), R.drawable.home_present, context)
        ImageUtil.squareDrawableImage(mView!!.messageImage(), R.drawable.show_me_your_heart, context)
        ImageUtil.squareDrawableImage(mView!!.yourImage(), R.drawable.home_text, context)
    }
}