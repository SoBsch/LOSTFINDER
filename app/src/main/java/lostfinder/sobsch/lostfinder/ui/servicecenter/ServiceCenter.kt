package lostfinder.sobsch.lostfinder.ui.servicecenter

import kotlinx.android.synthetic.main.activity_service_center.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity
import lostfinder.sobsch.lostfinder.ui.consult.Consult
import lostfinder.sobsch.lostfinder.ui.faq.FAQ
import org.jetbrains.anko.intentFor

class ServiceCenter : BaseActivity<ServiceCenterContract.View, ServiceCenterContract.Presenter>(),
        ServiceCenterContract.View {

    override var mPresenter: ServiceCenterContract.Presenter = ServiceCenterPresenter()

    override fun getResID(): Int = R.layout.activity_service_center

    override fun init() {

        service_center_faq.setOnClickListener { startActivity(intentFor<FAQ>()) }
        service_center_consult.setOnClickListener { startActivity(intentFor<Consult>()) }
    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}