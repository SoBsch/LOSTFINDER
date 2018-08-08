package lostfinder.sobsch.lostfinder.ui.chat

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface ChatContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{

    }
}