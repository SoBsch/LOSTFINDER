package lostfinder.sobsch.lostfinder.ui.consult

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface ConsultContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

        fun submit(context: Context, success: () -> Unit)
    }
}