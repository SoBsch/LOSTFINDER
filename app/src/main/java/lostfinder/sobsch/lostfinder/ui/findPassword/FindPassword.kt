package lostfinder.sobsch.lostfinder.ui.findPassword

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.findID.FindIDContract
import lostfinder.sobsch.lostfinder.ui.findID.FindIDPresenter

class FindPassword : BaseActivity<FindPasswordContract.View, FindPasswordContract.Presenter>(), FindPasswordContract.View {

    override var mPresenter: FindPasswordContract.Presenter = FindPasswordPresenter()

    override fun getResID(): Int = R.layout.activity_find_id

    override fun init() {
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }


}