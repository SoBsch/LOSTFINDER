package lostfinder.sobsch.lostfinder.ui.main

import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.main_content.*
import kotlinx.android.synthetic.main.main_header.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity


class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), NavigationView.OnNavigationItemSelectedListener {
    override var mPresenter: MainContract.Presenter = MainPresenter()

    override fun getResID(): Int = R.layout.activity_main

    override fun init() {

        setSupportActionBar()
        main_navigation.setNavigationItemSelectedListener(this)
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

    private fun setSupportActionBar() {
        setSupportActionBar(main_toolbar)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        item.isChecked = true
        main_drawer_layout.closeDrawers()

        when (item.itemId) {

        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item!!.itemId) {
            android.R.id.home -> {
                main_drawer_layout.openDrawer(GravityCompat.START)
                return true
            }
            R.id.action_settings -> return true
        }
        return super.onOptionsItemSelected(item)
    }

}
