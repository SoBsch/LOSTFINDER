package lostfinder.sobsch.lostfinder.ui.register.fragment.main

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class RegisterMainPresenter : BasePresenterImpl<RegisterMainContract.View>(), RegisterMainContract.Presenter {

    override fun loadImage(context: Context) {
        ImageUtil.squareDrawableImage(mView!!.personImage(), R.drawable.user_icon, context)
    }
}