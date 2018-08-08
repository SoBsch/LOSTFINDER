package lostfinder.sobsch.lostfinder.ui.findstuff.view.mode

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract
import lostfinder.sobsch.lostfinder.util.DIALOG_NFC
import lostfinder.sobsch.lostfinder.util.DialogUtils

class FindStuffModePresenter : BasePresenterImpl<FindStuffModeContract.View>(), FindStuffModeContract.Presenter {

    override fun openDirect(context: Context, isDirectOpen: FindStuffContract.FragmentCallbackListener) {
        openDialog(context, isDirectOpen.onCamera())
    }

    override fun openMessage(context: Context, isMessageOpen: FindStuffContract.FragmentCallbackListener) {
        openDialog(context, isMessageOpen.onCamera())
    }

    private fun openDialog(context: Context, action: Unit) {

        val dialog = DialogUtils.StuffNFCDialog(context, DIALOG_NFC)

        dialog.show()
        dialog.setOnDismissListener {  }
    }
}