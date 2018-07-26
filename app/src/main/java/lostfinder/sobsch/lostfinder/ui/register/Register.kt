package lostfinder.sobsch.lostfinder.ui.register

import kotlinx.android.synthetic.main.activity_register.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class Register : BaseFragmentActivity<RegisterContract.View, RegisterContract.Presenter>(), RegisterEventListenter {

    override var mPresenter: RegisterContract.Presenter = RegisterPresenter()

    override fun getResID(): Int = R.layout.activity_register

    override fun init() {

        mPresenter.getSupportFragmentManager(supportFragmentManager)
        mPresenter.mainFragment()

        register_back.setOnClickListener { popBack() }


    }

    override fun resume() {

    }

    override fun pause() {
    }


    override fun destroy() {
    }

    override fun onAccent() = mPresenter.accentFragment()

    override fun popBack() = mPresenter.popBackStack()


}