package lostfinder.sobsch.lostfinder.ui.servicecenter

import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseActivity

class ServiceCenter : BaseActivity<ServiceCenterContract.View, ServiceCenterContract.Presenter>(),
        ServiceCenterContract.View {

    override var mPresenter: ServiceCenterContract.Presenter = ServiceCenterPresenter()

    override fun getResID(): Int = R.layout.activity_service_center

    override fun init() {

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun destroy() {

    }

}