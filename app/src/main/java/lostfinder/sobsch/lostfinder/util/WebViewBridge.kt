package lostfinder.sobsch.lostfinder.util

import android.os.Handler
import android.util.Log
import android.webkit.JavascriptInterface
import lostfinder.sobsch.lostfinder.ui.findAddress.FindAddressContract

class WebViewBridge(private val callback: FindAddressContract.Presenter) {

    @JavascriptInterface
    fun getAddress(arg1: String, arg2: String, arg3: String) {
        Handler().post {
            val address = String.format("(%s) %s %s", arg1, arg2, arg3)
            callback.setAddress(address)
        }
    }
}