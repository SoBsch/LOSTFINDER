package lostfinder.sobsch.lostfinder.ui.message

import android.app.ActionBar
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface MessageContract{

    interface View: BaseView{

    }

    interface Presenter: BasePresenter<View>{


    }
}