package lostfinder.sobsch.lostfinder.ui.findstuff.view.mode

import kotlinx.android.synthetic.main.stuff_mode.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.findstuff.FindStuffContract

class FindStuffMode : BaseFragment<FindStuffModeContract.View, FindStuffModeContract.Presenter>(), FindStuffModeContract.View {

    private lateinit var mCallback: FindStuffContract.FragmentCallbackListener

    override var mPresenter: FindStuffModeContract.Presenter = FindStuffModePresenter()

    override fun getResId(): Int = R.layout.stuff_mode

    override fun attach() {

        try {
            mCallback = activity as FindStuffContract.FragmentCallbackListener
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        stuff_mode_direct.setOnClickListener { mPresenter.openDirect(context!!, mCallback) }
        stuff_mode_message.setOnClickListener { mPresenter.openMessage(context!!, mCallback) }
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }
}