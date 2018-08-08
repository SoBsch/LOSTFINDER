package lostfinder.sobsch.lostfinder.ui.near

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragmentActivity

class Near : BaseFragmentActivity<NearContract.View, NearContract.Presenter>(), NearContract.View {

    override var mPresenter: NearContract.Presenter = NearPresenter()

    override fun getResID(): Int = R.layout.activity_near

    override fun init() {

        mPresenter.getSupportFragmentManager(supportFragmentManager)
        mPresenter.loadNaverMap()

        // TODO 마커 추가
        // TODO 마커 클릭 시 다이얼로그 생성 & 고객센터 지도 추가

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}