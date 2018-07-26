package lostfinder.sobsch.lostfinder.ui.register

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class Register : BaseFragmentActivity<RegisterContract.View, RegisterContract.Presenter>() {

    override var mPresenter: RegisterContract.Presenter = RegisterPresenter()

    override fun getResID(): Int = R.layout.activity_register

    override fun init() {

        mPresenter.getSupportFragmentManager(supportFragmentManager)
        mPresenter.mainFragment()
    }

    override fun resume() {

    }

    override fun pause() {
    }


    override fun destroy() {
    }


}