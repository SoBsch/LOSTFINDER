package lostfinder.sobsch.lostfinder.ui.findID

import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_find_id.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class FindID : BaseActivity<FindIDContract.View, FindIDContract.Presenter>(), FindIDContract.View {

    override var mPresenter: FindIDContract.Presenter = FindIDPresenter()

    override fun getResID(): Int = R.layout.activity_find_id

    override fun logo(): ImageView = find_id_logo

    override fun init() {

        mPresenter.loadImage(this)

        // 휴대폰으로 찾기
        find_id_phone.setOnClickListener { }

        // 메일로 찾기
        find_id_mail.setOnClickListener {}
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }


}