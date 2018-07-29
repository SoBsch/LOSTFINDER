package lostfinder.sobsch.lostfinder.ui.findPassword

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class FindPasswordPresenter : BasePresenterImpl<FindPasswordContract.View>(), FindPasswordContract.Presenter {

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }
}