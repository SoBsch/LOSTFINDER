package lostfinder.sobsch.lostfinder.ui.register.fragment.certification

import android.util.Log
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl

class RegisterCertificationPresenter : BasePresenterImpl<RegisterCertificationContract.View>(),
        RegisterCertificationContract.Presenter {

    override fun checkNotEmptyEditText(name: String, number: String): Boolean {

        if (name.isEmpty()) {
            Log.e("name", "empty")
            mView!!.toastMessage("이름을 작성해 주세요.")
            return false
        }

        if (number.isEmpty()) {
            Log.e("number", "empty")
            mView!!.toastMessage("연락처를 작성해 주세요.")
            return false
        }

        return name.isNotEmpty() && number.isNotEmpty()
    }

}