package lostfinder.sobsch.lostfinder.ui.findID

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class FindIDPresenter : BasePresenterImpl<FindIDContract.View>(), FindIDContract.Presenter {


    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }
}