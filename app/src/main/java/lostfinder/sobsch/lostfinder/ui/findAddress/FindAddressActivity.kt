package lostfinder.sobsch.lostfinder.ui.findAddress

import android.app.AlertDialog
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_find_address.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity


class FindAddressActivity : BaseActivity<FindAddressContract.View, FindAddressContract.Presenter>(), FindAddressContract.View {

    override var mPresenter: FindAddressContract.Presenter = FindAddressPresenter()

    override fun getResID(): Int = R.layout.activity_find_address

    override fun webView(): WebView = find_address_web_view

    override fun init() {

        mPresenter.attachWebView()
    }

    override fun resume() {
    }


    override fun pause() {

    }

    override fun destroy() {

    }

    override fun dialog(address: String) {
        runOnUiThread {
            AlertDialog.Builder(this).apply {
                setTitle("주소선택")
                setMessage("선택된 주소가 맞습니까?")
                setPositiveButton("예") { _, _ ->
                    finishActivity(address)
                }
                setNegativeButton("아니오") { _, _ ->

                }
            }.show()
        }

    }

    private fun finishActivity(address: String) {
        val intent = intent.putExtra("address", address)
        setResult(3000, intent)
        finish()
    }


}