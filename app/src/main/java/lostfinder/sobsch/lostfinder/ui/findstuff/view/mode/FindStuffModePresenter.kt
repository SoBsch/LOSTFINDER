package lostfinder.sobsch.lostfinder.ui.findstuff.view.mode

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.chat.Chat
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract
import lostfinder.sobsch.lostfinder.util.DIALOG_MODE
import lostfinder.sobsch.lostfinder.util.DialogUtils
import org.jetbrains.anko.intentFor

class FindStuffModePresenter : BasePresenterImpl<FindStuffModeContract.View>(), FindStuffModeContract.Presenter {

    override fun openDirect(context: Context, isDirectOpen: FindStuffContract.FragmentCallbackListener) {
        openDialog(context)
    }

    override fun openMessage(context: Context, isMessageOpen: FindStuffContract.FragmentCallbackListener) {
        openDialog(context)
    }

    private fun openDialog(context: Context) {

        val dialog = DialogUtils.StuffNFCDialog(context, DIALOG_MODE)

        dialog.show()
        dialog.setOnDismissListener { intentMessage(context) }
    }

    private fun intentMessage(context: Context) = context.startActivity(context.intentFor<Chat>())
}