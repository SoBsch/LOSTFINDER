package lostfinder.sobsch.lostfinder.ui.splash

import android.content.Context
import io.reactivex.Completable
import io.reactivex.schedulers.Schedulers
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.util.ImageUtil
import java.util.concurrent.TimeUnit

class SplashPresenter : SplashContract.Presenter {

    private lateinit var view: SplashContract.View


    override fun attachView(view: SplashContract.View) {
        this.view = view
    }

    override fun loadImages(context: Context) {
        ImageUtil.squareDrawableImage(view.logo(), R.drawable.splash_logo, context)
        ImageUtil.squareDrawableImage(view.top(), R.drawable.splash_top, context)
        ImageUtil.squareDrawableImage(view.content(), R.drawable.splash_content, context)
        ImageUtil.squareDrawableImage(view.bottom(), R.drawable.splash_bottom, context)
    }

    override fun finishSplash(isTimeOver: () -> Unit) = Completable.timer(2900, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.computation())
            .doOnComplete { isTimeOver() }
            .subscribe()
}