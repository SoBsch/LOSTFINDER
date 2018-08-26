package lostfinder.sobsch.lostfinder.ui.consult

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface ConsultContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}