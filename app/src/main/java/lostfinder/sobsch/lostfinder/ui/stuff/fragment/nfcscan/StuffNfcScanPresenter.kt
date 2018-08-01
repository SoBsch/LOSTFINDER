package lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan

import android.content.Context
import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class StuffNfcScanPresenter : BasePresenterImpl<StuffNfcScanContract.View>(), StuffNfcScanContract.Presenter {

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.nfcImage(), R.drawable.illust, context)
    }

}