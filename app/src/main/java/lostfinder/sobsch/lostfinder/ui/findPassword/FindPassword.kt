package lostfinder.sobsch.lostfinder.ui.findPassword

import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_find_password.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class FindPassword : BaseActivity<FindPasswordContract.View, FindPasswordContract.Presenter>(), FindPasswordContract.View {

    override var mPresenter: FindPasswordContract.Presenter = FindPasswordPresenter()

    override fun getResID(): Int = R.layout.activity_find_password

    override fun logo(): ImageView = find_password_logo

    override fun init() {

        mPresenter.loadImage(this)

    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }


}