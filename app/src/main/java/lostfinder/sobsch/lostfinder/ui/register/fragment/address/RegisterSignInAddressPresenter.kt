package lostfinder.sobsch.lostfinder.ui.register.fragment.address

import android.content.Context
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import lostfinder.sobsch.lostfinder.util.StringUtil

class RegisterSignInAddressPresenter : BasePresenterImpl<RegisterSignInAddressContract.View>(), RegisterSignInAddressContract.Presenter {

    override fun submitAddress(mCallback: RegisterEventListenter, context: Context) {

        if (isNickNameValid(mView!!.nickname().text.toString()) &&
                isEmailValid(mView!!.email().text.toString()) &&
                isAddressValid(mView!!.address().text.toString(), mView!!.otherAddress().text.toString())) {

            // 서버 업로드
            uploadServer(mCallback)

        }
    }

    // 닉네임 체크
    private fun isNickNameValid(name: String): Boolean = name.isNotEmpty()

    // 이메일
    private fun isEmailValid(email: String): Boolean {

        val isEmail = email.isNotEmpty()

        return if (!isEmail) {
            false
        } else {
            StringUtil.isEmailValid(email)
        }

    }

    // 주소
    private fun isAddressValid(address: String, other: String): Boolean = address.isNotEmpty() && other.isNotEmpty()

    // 서버 업로드
    private fun uploadServer(mCallback: RegisterEventListenter) {

        // if success
        mCallback.onRegisterDone()
    }
}