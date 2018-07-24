package lostfinder.sobsch.lostfinder.ui.home

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface HomeContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}