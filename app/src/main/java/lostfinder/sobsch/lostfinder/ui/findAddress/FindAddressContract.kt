package lostfinder.sobsch.lostfinder.ui.findAddress

import android.app.Activity
import android.webkit.WebView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface FindAddressContract {

    interface View : BaseView {

        fun webView(): WebView

        fun dialog(address: String)
    }

    interface Presenter : BasePresenter<View> {


        fun attachWebView()

        fun setAddress(address: String)

    }


}