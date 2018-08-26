package lostfinder.sobsch.lostfinder.ui.consult

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.DIALOG_NFC
import lostfinder.sobsch.lostfinder.util.DialogUtils

class ConsultPresenter : BasePresenterImpl<ConsultContract.View>(), ConsultContract.Presenter {

    override fun submit(context: Context, success: () -> Unit) {

        val dialog = DialogUtils.StuffNFCDialog(context, DIALOG_NFC)

        dialog.show()

        dialog.setOnDismissListener { success() }
    }
}