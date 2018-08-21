package lostfinder.sobsch.lostfinder.ui.login

import android.content.Context
import android.widget.ImageView
import lostfinder.sobsch.lostfinder.ui.base.BasePresenter
import lostfinder.sobsch.lostfinder.ui.base.BaseView

interface LoginContract{

    interface View: BaseView{

        fun logo(): ImageView

        fun intentMain()

        fun toastMessage(message: String)
    }

    interface Presenter: BasePresenter<View>{

        fun loadImage(context: Context)

        fun submitLogin(id: String, pw: String)
    }
}