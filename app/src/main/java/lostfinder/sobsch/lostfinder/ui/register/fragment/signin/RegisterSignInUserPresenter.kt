package lostfinder.sobsch.lostfinder.ui.register.fragment.signin

import android.content.Context
import android.util.Log
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import lostfinder.sobsch.lostfinder.util.UIUtils

class RegisterSignInUserPresenter : BasePresenterImpl<RegisterSignInUserContract.View>(), RegisterSignInUserContract.Presenter {

    private var usedID = false  // 서버에서 체크되어 사용할 수 있는 아이디 인지

    override fun validateUserId() {
        // 서버에서 체크
        usedID = true
    }

    override fun submitSignIn(mCallback: RegisterEventListenter, context: Context) {

        if (checkPassword(context) && isValidId() && usedID) {   // ! 빼야됨

            val id = mView!!.userId().text.toString()
            val pw = mView!!.userPassword().text.toString()
            mCallback.onSignInAddress(id, pw)
        }
    }

    private fun isValidId(): Boolean = mView!!.userId().text.toString().isNotEmpty()

    private fun checkPassword(context: Context): Boolean {

        if (mView!!.userPassword().text.toString().isEmpty() || mView!!.userCheckPassword().text.toString().isEmpty()) {
            UIUtils.toastMessage("빈칸을 확인해 주세요.", context)
            return false
        }

        return mView!!.userPassword().text.toString() == mView!!.userCheckPassword().text.toString()
    }
}