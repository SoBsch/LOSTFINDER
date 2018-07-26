package lostfinder.sobsch.lostfinder.ui.register

import android.support.v4.app.FragmentManager
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.fragment.accent.RegisterAccent
import lostfinder.sobsch.lostfinder.ui.register.fragment.main.RegisterMain

class RegisterPresenter : BasePresenterImpl<RegisterContract.View>(), RegisterContract.Presenter {

    private lateinit var supportFragmentMananger: FragmentManager

    override fun getSupportFragmentManager(fm: FragmentManager) {
        supportFragmentMananger = fm
    }

    override fun popBackStack() {
        supportFragmentMananger.popBackStack()
    }

    override fun mainFragment() {
        supportFragmentMananger.beginTransaction()
                .add(R.id.register_container, RegisterMain())
                .commit()
    }

    override fun accentFragment() {
        supportFragmentMananger.beginTransaction()
                .replace(R.id.register_container, RegisterAccent())
                .addToBackStack(null)
                .commit()
    }

}