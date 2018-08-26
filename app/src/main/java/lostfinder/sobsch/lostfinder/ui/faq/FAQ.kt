package lostfinder.sobsch.lostfinder.ui.faq

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class FAQ : BaseActivity<FaqContract.View, FaqContract.Presenter>(), FaqContract.View {

    override var mPresenter: FaqContract.Presenter = FaqPresenter()

    override fun getResID(): Int = R.layout.activity_faq

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }


}