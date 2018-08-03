package lostfinder.sobsch.lostfinder.ui.stuff.fragment.write

import android.widget.ImageView
import kotlinx.android.synthetic.main.stuff_write.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.stuff.StuffEventListener

class StuffWrite : BaseFragment<StuffWriteContract.View, StuffWriteContract.Presenter>(), StuffWriteContract.View {

    private lateinit var mCallback: StuffEventListener

    override var mPresenter: StuffWriteContract.Presenter = StuffWritePresenter()

    override fun getResId(): Int = R.layout.stuff_write

    override fun stuffImage(): ImageView = stuff_write_image

    override fun init() {

        mPresenter.loadImage(context!!, "")

        stuff_write_submit.setOnClickListener { mPresenter.uploadStuff(context!!, mCallback) }
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }

    override fun attach() {
        try {
            mCallback = activity as StuffEventListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }


}