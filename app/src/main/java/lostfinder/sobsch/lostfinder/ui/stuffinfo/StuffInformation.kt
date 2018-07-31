package lostfinder.sobsch.lostfinder.ui.stuffinfo

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class StuffInformation : BaseActivity<StuffInformationContract.View, StuffInformationContract.Presenter>(),
        StuffInformationContract.View {

    override var mPresenter: StuffInformationContract.Presenter = StuffInformationPresenter()

    override fun getResID(): Int = R.layout.activity_stuff_information

    override fun init() {
    }

    override fun resume() {
    }

    override fun pause() {

    }

    override fun destroy() {

    }

}