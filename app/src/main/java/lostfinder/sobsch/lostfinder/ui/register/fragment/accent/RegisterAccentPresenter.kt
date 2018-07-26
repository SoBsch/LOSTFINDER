package lostfinder.sobsch.lostfinder.ui.register.fragment.accent

import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterAccentPresenter : BasePresenterImpl<RegisterAccentContract.View>(), RegisterAccentContract.Presenter {

    // 체크박스 유효성 검사
    override fun validateCheckedAll(mCallback: RegisterEventListenter) {

        if (mView!!.accentAllCheckBox().isChecked) {
            mCallback.onCertification()
        } else {
            mView!!.toastMessage("약관을 모두 동의해 주세요.")
        }
    }

    // 모두 확인 체크박스 이벤트
    override fun checkAllEvent() {

        if (!mView!!.accentAllCheckBox().isChecked) {
            mView!!.accentAllCheckBox().isChecked = false
            mView!!.serviceCheckBox().isChecked = false
            mView!!.privacyCheckBox().isChecked = false
        } else {
            mView!!.accentAllCheckBox().isChecked = true
            mView!!.serviceCheckBox().isChecked = true
            mView!!.privacyCheckBox().isChecked = true
        }
    }

    override fun checkBoxStatus() {
        val isServiceChecked = mView!!.serviceCheckBox().isChecked
        val isPrivacyChecked = mView!!.privacyCheckBox().isChecked

        mView!!.accentAllCheckBox().isChecked = isServiceChecked && isPrivacyChecked
    }
}