package lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan

import android.content.Context
import android.nfc.NfcAdapter
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener
import lostfinder.sobsch.lostfinder.util.DIALOG_NFC
import lostfinder.sobsch.lostfinder.util.DialogUtils
import lostfinder.sobsch.lostfinder.util.ImageUtil

class StuffNfcScanPresenter : BasePresenterImpl<StuffNfcScanContract.View>(), StuffNfcScanContract.Presenter {

    private lateinit var nfcAdapter: NfcAdapter

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.nfcImage(), R.drawable.illust, context)
    }

    override fun setNfcAdapter(context: Context) {
        nfcAdapter = NfcAdapter.getDefaultAdapter(context)
    }

    override fun isValidNFC(): Boolean = nfcAdapter != null

    // 등록 완료 됬을 시 호출
    override fun nfcSuccess(context: Context, isCameraOpen: StuffEventListener) {
        val dialog = DialogUtils.StuffNFCDialog(context, DIALOG_NFC)

        dialog.show()

        // 카메라 호출
        dialog.setOnDismissListener { isCameraOpen.onCamera() }
    }

}