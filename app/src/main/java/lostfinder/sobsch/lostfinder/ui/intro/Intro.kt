package lostfinder.sobsch.lostfinder.ui.intro

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Intro : BaseActivity<IntroContract.View, IntroContract.Presenter>(), IntroContract.View {
    override var mPresenter: IntroContract.Presenter = IntroPresenter()

    override fun getResID(): Int = R.layout.activity_intro

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}