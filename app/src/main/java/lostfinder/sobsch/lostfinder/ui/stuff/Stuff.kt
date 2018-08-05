package lostfinder.sobsch.lostfinder.ui.stuff

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class Stuff : BaseFragmentActivity<StuffContract.View, StuffContract.Presenter>(), StuffContract.View,
        StuffEventListener {
    override var mPresenter: StuffContract.Presenter = StuffPresenter()

    override fun getResID(): Int = R.layout.activity_stuff

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

    /* Stuff Callback Event*/
    override fun onCamera() = mPresenter.onLoadCamera(this)

    override fun onWrite(path: String) = mPresenter.onLoadWrite(this, path)

    override fun onSubmit() {
        finish()
    }

    override fun onBack() {
        finish()
    }

}