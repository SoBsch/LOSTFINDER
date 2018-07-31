package lostfinder.sobsch.lostfinder.ui.stuff

import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface StuffContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

    }
}