package lostfinder.sobsch.lostfinder.ui.stuffinfo

import kotlinx.android.synthetic.main.stuff_info_header.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.stuff.Stuff
import org.jetbrains.anko.intentFor

class StuffInformation : BaseActivity<StuffInformationContract.View, StuffInformationContract.Presenter>(),
        StuffInformationContract.View {

    override var mPresenter: StuffInformationContract.Presenter = StuffInformationPresenter()

    override fun getResID(): Int = R.layout.activity_stuff_information

    override fun init() {

        stuff_header_submit.setOnClickListener { startActivity(intentFor<Stuff>()) }
    }

    override fun resume() {
    }

    override fun pause() {

    }

    override fun destroy() {

    }

}