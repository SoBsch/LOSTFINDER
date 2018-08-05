package lostfinder.sobsch.lostfinder.ui.stuff.fragment.write

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener
import lostfinder.sobsch.lostfinder.util.DialogUtils
import lostfinder.sobsch.lostfinder.util.ImageUtil

class StuffWritePresenter : BasePresenterImpl<StuffWriteContract.View>(), StuffWriteContract.Presenter {


    override fun loadImage(context: Context, path: String) {

        ImageUtil.stuffImage(mView!!.stuffImage(), path, context)

    }

    // TODO 서버 업로드 구현
    override fun uploadStuff(context: Context, mCallback: StuffEventListener) {
        // is succssed
        val dialog = DialogUtils.StuffNFCDialog(context)

        dialog.show()

        // 카메라 호출
        dialog.setOnDismissListener { mCallback.onSubmit() }
    }
}