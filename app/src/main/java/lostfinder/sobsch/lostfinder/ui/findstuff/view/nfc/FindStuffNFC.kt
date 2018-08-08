package lostfinder.sobsch.lostfinder.ui.findstuff.view.nfc

import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.stuff_nfc_scan.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract

class FindStuffNFC : BaseFragment<FindStuffNFCContract.View, FindStuffNFCContract.Presenter>(), FindStuffNFCContract.View {

    private lateinit var mCallback: FindStuffContract.FragmentCallbackListener

    override var mPresenter: FindStuffNFCContract.Presenter = FindStuffNFCPresenter()

    override fun getResId(): Int = R.layout.stuff_nfc_scan

    override fun titleText(): TextView = stuff_nfc_scan_title

    override fun nfcImage(): ImageView = stuff_nfc_scan_image

    override fun attach() {

        try {
            mCallback = activity as FindStuffContract.FragmentCallbackListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {


        mPresenter.setTitle("찾아주기")
        mPresenter.loadImage(context!!)

        // nfc click
        stuff_nfc_scan_submit.setOnClickListener { mPresenter.nfcSuccess(context!!, mCallback) }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }



}