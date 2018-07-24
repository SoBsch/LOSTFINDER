package lostfinder.sobsch.lostfinder.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import lostfinder.sobsch.lostfinder.ui.home.Home
import lostfinder.sobsch.lostfinder.ui.message.Message
import lostfinder.sobsch.lostfinder.ui.mypage.Mypage

class TabLayoutPageAdapter(fm: FragmentManager?, private val tabCount: Int) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment? = when (position) {

        0 -> Home()
        1 -> Message()
        2 -> Mypage()

        else -> null
    }

    override fun getCount(): Int = tabCount

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        return super.instantiateItem(container, position)
    }
}