package lostfinder.sobsch.lostfinder.ui.intro

import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_intro.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Intro : BaseActivity<IntroContract.View, IntroContract.Presenter>(), IntroContract.View {
    override var mPresenter: IntroContract.Presenter = IntroPresenter()

    override fun getResID(): Int = R.layout.activity_intro

    override fun init() {

        Glide.with(this)
                .asGif()
                .load(R.drawable.phone_gif)
                .into(intro_top_gif)

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}