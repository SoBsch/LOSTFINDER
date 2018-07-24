package lostfinder.sobsch.lostfinder.ui.message

import android.util.Log
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class Message : BaseFragment<MessageContract.View, MessageContract.Presenter>(), MessageContract.View {

    override var mPresenter: MessageContract.Presenter = MessagePresenter()

    override fun getResId(): Int = R.layout.fragment_message

    override fun init() {
        Log.e("message", "message")

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }


}