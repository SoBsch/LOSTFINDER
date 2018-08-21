package lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan

import android.nfc.NfcAdapter
import android.nfc.Tag
import android.nfc.tech.Ndef
import android.util.Log
import android.widget.ImageView
import kotlinx.android.synthetic.main.stuff_nfc_scan.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener

class StuffNfcScan : BaseFragment<StuffNfcScanContract.View, StuffNfcScanContract.Presenter>(),
        StuffNfcScanContract.View {

    private lateinit var mCallback: StuffEventListener

    override var mPresenter: StuffNfcScanContract.Presenter = StuffNfcScanPresenter()

    override fun getResId(): Int = R.layout.stuff_nfc_scan

    override fun nfcImage(): ImageView = stuff_nfc_scan_image

    override fun init() {

        mPresenter.loadImage(context!!)
        mPresenter.setNfcAdapter(context!!)

        // nfc click
        stuff_nfc_scan_submit.setOnClickListener {
            // mPresenter.nfcSuccess(context!!, mCallback)
            test()
        }

    }

    private fun test() {
        var adapter = NfcAdapter.getDefaultAdapter(context!!)

        if (adapter == null) {
            Log.e("nfc", "지원 안하는 단말기")
            return
        } else {
            Log.e("nfc", "지원 함")
        }

    }

    override fun resume() {
        val tag: Tag? = activity?.intent?.getParcelableExtra(NfcAdapter.EXTRA_TAG)


        if (tag != null) {
            val ndef = Ndef.get(tag)
            ndef.type
            Log.e("test", "test")
        }

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun attach() {

        try {
            mCallback = activity as StuffEventListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }

    }

}