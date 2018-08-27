package lostfinder.sobsch.lostfinder.ui.findAddress


import android.webkit.WebChromeClient
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.BASE_URL
import lostfinder.sobsch.lostfinder.util.FIND_ADDRESS_PATH
import lostfinder.sobsch.lostfinder.util.WebViewBridge

class FindAddressPresenter : BasePresenterImpl<FindAddressContract.View>(), FindAddressContract.Presenter {

    override fun attachWebView() {
        val webView = mView!!.webView()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            addJavascriptInterface(WebViewBridge(this@FindAddressPresenter), "lostfinder")
            webChromeClient = WebChromeClient()
            loadUrl(BASE_URL + FIND_ADDRESS_PATH)
        }
    }

    override fun setAddress(address: String) {
        mView!!.dialog(address)
    }


}