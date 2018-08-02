package lostfinder.sobsch.lostfinder.util

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.stuff_dialog.*
import lostfinder.sobsch.lostfinder.R


object DialogUtils {

    class StuffNFCDialog(context: Context) : Dialog(context) {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(R.layout.stuff_dialog)

            init()
        }

        private fun init() {

            stuff_dialog_submit.setOnClickListener {
                onSuccess()
            }
        }

        fun onSuccess() {
            dismiss()
        }

    }
}