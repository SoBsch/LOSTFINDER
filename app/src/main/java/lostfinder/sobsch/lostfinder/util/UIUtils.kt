package lostfinder.sobsch.lostfinder.util

import android.app.Activity
import android.view.WindowManager

object UIUtils{

    // 전체화면
    fun isViewFullScreen(isFull: Boolean, activity: Activity) {

        if (isFull) {
            activity.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else {
            activity.window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
    }
}