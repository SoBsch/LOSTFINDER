package lostfinder.sobsch.lostfinder.ui.findAddress

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class FindAddressActivity : BaseActivity<FindAddressContract.View, FindAddressContract.Presenter>(), FindAddressContract.View {

    override var mPresenter: FindAddressContract.Presenter = FindAddressPresenter()

    override fun getResID(): Int = R.layout.activity_find_address

    override fun init() {

    }

    override fun resume() {
    }


    override fun pause() {

    }

    override fun destroy() {

    }


}