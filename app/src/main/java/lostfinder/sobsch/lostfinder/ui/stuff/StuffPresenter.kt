package lostfinder.sobsch.lostfinder.ui.stuff

import android.app.Activity
import android.support.v4.app.FragmentManager
import android.view.WindowManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera.StuffCamera
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.nfcscan.StuffNfcScan
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.write.StuffWrite


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

    override fun onLoadCamera(activity: Activity) {

        isViewFullScreen(true, activity)

        supportFragmentMananger.beginTransaction()
                .replace(R.id.stuff_container, StuffCamera())
                .commit()
    }

    override fun onLoadWrite(activity: Activity) {

        isViewFullScreen(false, activity)

        supportFragmentMananger.beginTransaction()
                .replace(R.id.stuff_container, StuffWrite())
                .commit()
    }

    private fun isViewFullScreen(isFull: Boolean, activity: Activity) {

        if (isFull) {
            activity.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else {
            activity.window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
    }
}