package lostfinder.sobsch.lostfinder.ui.stuff.fragment.write

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class StuffWrite : BaseFragment<StuffWriteContract.View, StuffWriteContract.Presenter>(), StuffWriteContract.View {

    override var mPresenter: StuffWriteContract.Presenter = StuffWritePresenter()

    override fun getResId(): Int = R.layout.stuff_write

    override fun init() {
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }

    override fun attach() {
    }


}