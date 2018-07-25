package lostfinder.sobsch.lostfinder.ui.register

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Register : BaseActivity<RegisterContract.View, RegisterContract.Presenter>() {

    override var mPresenter: RegisterContract.Presenter = RegisterPresenter()

    override fun getResID(): Int = R.layout.activity_register

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {
    }


    override fun destroy() {
    }


}