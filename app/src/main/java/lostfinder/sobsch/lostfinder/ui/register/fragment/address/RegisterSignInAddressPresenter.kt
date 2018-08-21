package lostfinder.sobsch.lostfinder.ui.register.fragment.address

import android.content.Context
import android.util.Log
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import lostfinder.sobsch.lostfinder.network.RetrofitService
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.ui.register.RegisterEventListenter
import lostfinder.sobsch.lostfinder.util.StringUtil

class RegisterSignInAddressPresenter : BasePresenterImpl<RegisterSignInAddressContract.View>(), RegisterSignInAddressContract.Presenter {

    private var name: String? = null
    private var phone: String? = null
    private var userId: String? = null
    private var userPW: String? = null
    private var nickName: String? = null
    private var email: String? = null
    private var address: String? = null
    private var otherAddress: String? = null

    private val composite by lazy { CompositeDisposable() }
    private val api by lazy { RetrofitService.create() }


    override fun deathView() {
        composite.clear()
    }

    override fun setUserInfo(name: String?, phone: String?, id: String?, pw: String?) {
        this.name = name
        this.phone = phone
        this.userId = id
        this.userPW = pw
    }

    override fun submitAddress(mCallback: RegisterEventListenter, context: Context) {

        if (isNickNameValid(mView!!.nickname().text.toString()) &&
                isEmailValid(mView!!.email().text.toString()) &&
                isAddressValid(mView!!.address().text.toString(), mView!!.otherAddress().text.toString())) {

            nickName = mView!!.nickname().text.toString()
            email = mView!!.email().text.toString()
            address = mView!!.address().text.toString()
            otherAddress = mView!!.otherAddress().text.toString()
            // 서버 업로드
            composite.add(uploadServer(mCallback))

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
    private fun uploadServer(mCallback: RegisterEventListenter) =
            api.register(userId!!, userPW!!, nickName!!, address!!, nickName!!, phone!!, otherAddress!!)
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnSuccess {
                        if (it.result) {
                            mCallback.onRegisterDone()
                        } else {
                            Log.e("fail", "regist fail")
                        }

                    }
                    .doOnError { it.printStackTrace() }
                    .subscribe()
}