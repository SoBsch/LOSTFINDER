package lostfinder.sobsch.lostfinder.ui.near

import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.near.map.MapFragment

class NearPresenter : BasePresenterImpl<NearContract.View>(), NearContract.Presenter {

    private lateinit var supportFragmentMananger: FragmentManager

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun loadNaverMap() {
        supportFragmentMananger.beginTransaction()
                .add(R.id.near_map_container, MapFragment())
                .commit()
    }

}