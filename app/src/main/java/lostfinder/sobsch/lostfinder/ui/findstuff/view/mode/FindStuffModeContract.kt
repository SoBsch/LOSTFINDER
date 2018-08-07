package lostfinder.sobsch.lostfinder.ui.findstuff.view.mode

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface FindStuffModeContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}