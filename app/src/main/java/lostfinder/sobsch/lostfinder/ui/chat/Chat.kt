package lostfinder.sobsch.lostfinder.ui.chat

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Chat : BaseActivity<ChatContract.View, ChatContract.Presenter>(), ChatContract.View {

    override var mPresenter: ChatContract.Presenter = ChatPresenter()

    override fun getResID(): Int = R.layout.activity_chat

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}