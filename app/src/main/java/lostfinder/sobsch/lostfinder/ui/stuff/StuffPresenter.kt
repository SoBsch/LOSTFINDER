package lostfinder.sobsch.lostfinder.ui.stuff

import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera.StuffCamera
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan.StuffNfcScan

class StuffPresenter : BasePresenterImpl<StuffContract.View>(), StuffContract.Presenter {

    private lateinit var supportFragmentMananger: FragmentManager

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun popBackStack() {
        supportFragmentMananger.popBackStack()
    }

    override fun nfcScan() {
        supportFragmentMananger.beginTransaction()
                .add(R.id.stuff_container, StuffNfcScan())
                .commit()
    }

    override fun onLoadCamera() {
        popBackStack()

        supportFragmentMananger.beginTransaction()
                .replace(R.id.stuff_container, StuffCamera())
                .addToBackStack(null)
                .commit()
    }
}