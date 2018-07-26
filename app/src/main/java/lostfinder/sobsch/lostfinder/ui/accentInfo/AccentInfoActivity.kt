package lostfinder.sobsch.lostfinder.ui.accentInfo

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class AccentInfoActivity : BaseActivity<AccentInfoContract.View, AccentInfoContract.Presenter>(), AccentInfoContract.View {

    override var mPresenter: AccentInfoContract.Presenter = AccentInfoPresenter()

    override fun getResID(): Int = R.layout.activity_accent_info

    override fun init() {

    }

    override fun resume() {
    }


    override fun pause() {

    }

    override fun destroy() {

    }
}