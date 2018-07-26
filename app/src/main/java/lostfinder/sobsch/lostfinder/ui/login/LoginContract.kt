package lostfinder.sobsch.lostfinder.ui.login

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface LoginContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}