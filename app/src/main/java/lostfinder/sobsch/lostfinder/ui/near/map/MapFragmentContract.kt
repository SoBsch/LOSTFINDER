package lostfinder.sobsch.lostfinder.ui.near.map

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface MapFragmentContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}