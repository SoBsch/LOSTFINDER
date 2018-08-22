package lostfinder.sobsch.lostfinder.ui.intro

import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_intro.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Intro : BaseActivity<IntroContract.View, IntroContract.Presenter>(), IntroContract.View {
    override var mPresenter: IntroContract.Presenter = IntroPresenter()

    override fun getResID(): Int = R.layout.activity_intro

    override fun init() {

        // TODO gif 이미지 bottom 빈공간 남는거
        Glide.with(this)
                .asGif()
                .load(R.drawable.phone_gif)
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
                .into(intro_top_gif)

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}