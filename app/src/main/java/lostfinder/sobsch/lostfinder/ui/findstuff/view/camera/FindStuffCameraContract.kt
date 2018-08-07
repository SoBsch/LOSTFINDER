package lostfinder.sobsch.lostfinder.ui.findstuff.view.camera

import android.app.Activity
import android.content.Context
import android.hardware.Camera
import android.widget.FrameLayout
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface FindStuffCameraContract {

    interface View : BaseView {

        fun cameraPreview(): FrameLayout

        fun isImageWriteFinish(path: String)

    }

    interface Presenter : BasePresenter<View> {

        fun getCameraPermission(context: Context, activity: Activity)

        fun initCamera(activity: Activity, context: Context)
        fun camera(): Camera?

        fun releaseCamera()

        fun takePickture()
    }
}