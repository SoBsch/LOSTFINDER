package lostfinder.sobsch.lostfinder.ui.mypage

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment

class Mypage : BaseFragment<MypageContract.View, MypageContract.Presenter>(), MypageContract.View {

    override var mPresenter: MypageContract.Presenter = MypagePresenter()

    override fun getResId(): Int = R.layout.fragment_mypage

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