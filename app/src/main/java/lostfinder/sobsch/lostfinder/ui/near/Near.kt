package lostfinder.sobsch.lostfinder.ui.near

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Near : BaseActivity<NearContract.View, NearContract.Presenter>(), NearContract.View {

    override var mPresenter: NearContract.Presenter = NearPresenter()

    override fun getResID(): Int = R.layout.activity_near

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}