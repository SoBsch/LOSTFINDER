package lostfinder.sobsch.lostfinder.util

import android.app.Activity
import android.content.Context
import android.view.WindowManager
import android.widget.Toast

object UIUtils {

    // 전체화면
    fun isViewFullScreen(isFull: Boolean, activity: Activity) {

        if (isFull) {
            activity.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else {
            activity.window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
    }

    // toast
    fun toastMessage(message: String, context: Context) =
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}