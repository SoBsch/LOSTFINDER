package lostfinder.sobsch.lostfinder.adapter

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.util.ImageUtil

class MainImageSlider(val context: Context, private val items: MutableList<String>)
    : PagerAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val mView = inflater.inflate(R.layout.home_slide_item, container, false)

        val imageView = mView.findViewById<ImageView>(R.id.home_slide_image)

        ImageUtil.squareDrawableImage(imageView, R.drawable.ic_launcher_background, context)
        container.addView(mView)

        return mView
    }

    override fun isViewFromObject(view: View, p1: Any): Boolean {
        return view == p1
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val viewPager = container as ViewPager
        val view = `object` as View

        viewPager.removeView(view)
    }

    override fun getCount(): Int = items.size
}