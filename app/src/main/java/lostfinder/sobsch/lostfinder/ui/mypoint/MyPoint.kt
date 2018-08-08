package lostfinder.sobsch.lostfinder.ui.mypoint

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class MyPoint : BaseActivity<MyPointContract.View, MyPointContract.Presenter>(), MyPointContract.View {

    override var mPresenter: MyPointContract.Presenter = MyPointPresenter()

    override fun getResID(): Int = R.layout.activity_mypoint

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}