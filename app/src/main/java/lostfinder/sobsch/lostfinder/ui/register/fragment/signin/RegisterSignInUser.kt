package lostfinder.sobsch.lostfinder.ui.register.fragment.signin

import android.support.design.widget.TextInputEditText
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.register_signin_user.*
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.ui.base.BaseFragment
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter

class RegisterSignInUser : BaseFragment<RegisterSignInUserContract.View, RegisterSignInUserContract.Presenter>(), RegisterSignInUserContract.View,
        TextWatcher {


    private lateinit var mCallback: RegisterEventListenter

    override var mPresenter: RegisterSignInUserContract.Presenter = RegisterSignInUserPresenter()

    override fun getResId(): Int = R.layout.register_signin_user

    override fun userId(): TextInputEditText = register_signin_user_id

    override fun userPassword(): TextInputEditText = register_signin_user_password

    override fun userCheckPassword(): TextInputEditText = register_signin_user_check_password

    override fun attach() {

        try {
            mCallback = activity as RegisterEventListenter
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString())
        }
    }

    override fun init() {

        register_signin_submit.setOnClickListener { mPresenter.submitSignIn(mCallback, context!!) }

        register_signin_back.setOnClickListener { mCallback.popBack() }

        register_signin_user_id.addTextChangedListener(this)

        // TODO 아이디 변경될때마다 서버에서 유효값 체크 & 비밀번호 자리수, 두개가 값이 맞는지

    }

    override fun resume() {

    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        mPresenter.validateUserId()
    }


}