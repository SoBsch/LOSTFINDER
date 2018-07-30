package lostfinder.sobsch.lostfinder.ui.main

import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.GravityCompat
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.main_content.*
import kotlinx.android.synthetic.main.main_header.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.adapter.TabLayoutPageAdapter
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity


class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), NavigationView.OnNavigationItemSelectedListener,
        TabLayout.OnTabSelectedListener, MainContract.View {

    private lateinit var navigationHeader: View

    override var mPresenter: MainContract.Presenter = MainPresenter()

    override fun getResID(): Int = R.layout.activity_main

    override fun profileImage(): ImageView = navigationHeader.findViewById(R.id.drawer_header_image)

    override fun init() {

        initNavigationHeader()

        attachActionBar()

        main_navigation.setNavigationItemSelectedListener(this)

        setTabLayout()
        setViewPager()

    }

    // 네비게이션 헤터 세팅
    private fun initNavigationHeader() {
        navigationHeader = main_navigation.inflateHeaderView(R.layout.drawer_header)
        mPresenter.loadNavigationItems(this)
    }

    private fun attachActionBar() {

        setSupportActionBar(main_toolbar)
        mPresenter.setSupportActionBar(supportActionBar)        // 툴바
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        item.isChecked = true
        main_drawer_layout.closeDrawers()

        when (item.itemId) {

        }
        return true
    }

    // 텝 레이아웃
    private fun setTabLayout() = main_tablayout.apply {
        addTab(this.newTab().setText("홈"))
        addTab(this.newTab().setText("메시지"))
        addTab(this.newTab().setText("마이페이지"))
        tabGravity = TabLayout.GRAVITY_FILL
        addOnTabSelectedListener(this@MainActivity)
    }

    private fun setViewPager() {

        val mAdapter = TabLayoutPageAdapter(supportFragmentManager, main_tablayout.tabCount)

        main_viewpager.apply {
            adapter = mAdapter
            offscreenPageLimit = main_tablayout.tabCount
            addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(main_tablayout))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        //return super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item!!.itemId) {
            android.R.id.home -> {
                main_drawer_layout.openDrawer(GravityCompat.START)
                return true
            }
            R.id.action_search -> {

                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onTabReselected(p0: TabLayout.Tab?) {

    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        main_viewpager.currentItem = tab!!.position
    }
}
