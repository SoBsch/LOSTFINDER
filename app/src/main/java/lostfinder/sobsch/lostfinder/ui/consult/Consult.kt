package lostfinder.sobsch.lostfinder.ui.consult

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class Consult : BaseActivity<ConsultContract.View, ConsultContract.Presenter>(), ConsultContract.View {

    override var mPresenter: ConsultContract.Presenter = ConsultPresenter()

    override fun getResID(): Int = R.layout.activity_consult

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }


}