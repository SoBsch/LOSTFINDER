package lostfinder.sobsch.lostfinder.ui.findstuff

import android.app.Activity
import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.findstuff.view.camera.FindStuffCamera
import lostfinder.sobsch.lostfinder.ui.findstuff.view.mode.FindStuffMode
import lostfinder.sobsch.lostfinder.ui.findstuff.view.nfc.FindStuffNFC
import lostfinder.sobsch.lostfinder.util.UIUtils

class FindStuffPresenter : BasePresenterImpl<FindStuffContract.View>(), FindStuffContract.Presenter {

    private lateinit var supportFragmentMananger: FragmentManager

    private val container = R.id.find_stuff_container

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun popBackStack() {
        supportFragmentMananger.popBackStack()
    }

    override fun nfcScan() {
        supportFragmentMananger.beginTransaction()
                .add(container, FindStuffNFC())
                .commit()
    }

    override fun onLoadCamera(activity: Activity) {

        UIUtils.isViewFullScreen(true, activity)

        supportFragmentMananger.beginTransaction()
                .replace(container, FindStuffCamera())
                .commit()
    }

    override fun onMode() {

        supportFragmentMananger.beginTransaction()
                .replace(container, FindStuffMode())
                .commit()
    }
}