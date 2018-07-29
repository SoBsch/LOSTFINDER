package lostfinder.sobsch.lostfinder.ui.login

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class LoginPresenter : BasePresenterImpl<LoginContract.View>(), LoginContract.Presenter {

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }
}