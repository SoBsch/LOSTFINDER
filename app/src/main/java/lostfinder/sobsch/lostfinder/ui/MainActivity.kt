package lostfinder.sobsch.lostfinder.ui

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import kotlinx.android.synthetic.main.main_content.*
import lostfinder.sobsch.lostfinder.R

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_navi.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        item.isChecked = true
        main_drawer_layout.closeDrawers()

        when (item.itemId) {
            R.id.main_menu_top -> {
                Log.e("test", "test")}
        }

        return true
    }
}
