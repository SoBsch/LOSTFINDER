package lostfinder.sobsch.lostfinder.ui.servicecenter

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface ServiceCenterContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}