package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import android.content.Context
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class RegisterCertificationPresenter : BasePresenterImpl<RegisterCertificationContract.View>(),
        RegisterCertificationContract.Presenter {

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.phoneLogo(), R.drawable.phone_icon, context)
        ImageUtil.squareDrawableImage(mView!!.ipinLogo(), R.drawable.ipin_logo, context)
    }

}