package lostfinder.sobsch.lostfinder.ui.intro

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface IntroContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}