package lostfinder.sobsch.lostfinder.ui.findstuff

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class FindStuff : BaseFragmentActivity<FindStuffContract.View, FindStuffContract.Presenter>(),
        FindStuffContract.View, FindStuffContract.FragmentCallbackListener {

    override var mPresenter: FindStuffContract.Presenter = FindStuffPresenter()

    override fun getResID(): Int = R.layout.activity_find_stuff

    override fun init() {

        mPresenter.getSupportFragmentManager(supportFragmentManager)
        mPresenter.nfcScan()
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

    override fun onCamera() = mPresenter.onLoadCamera(this)

    override fun onMode() = mPresenter.onMode()

}