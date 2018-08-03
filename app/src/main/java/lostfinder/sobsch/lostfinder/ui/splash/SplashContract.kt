package lostfinder.sobsch.lostfinder.ui.splash

import android.content.Context
import android.widget.ImageView
import io.reactivex.disposables.Disposable

interface SplashContract {

    interface View {

        fun top(): ImageView
        fun logo(): ImageView
        fun content(): ImageView
        fun bottom(): ImageView

    }

    interface Presenter {

        fun attachView(view: View)

        fun loadImages(context: Context)

        fun finishSplash(isTimeOver: () -> Unit): Disposable
    }
}