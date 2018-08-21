package lostfinder.sobsch.lostfinder.ui.login

import android.content.Context
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import lostfinder.sobsch.lostfinder.R
import lostfinder.sobsch.lostfinder.network.RetrofitService
import lostfinder.sobsch.lostfinder.ui.base.BasePresenterImpl
import lostfinder.sobsch.lostfinder.util.ImageUtil

class LoginPresenter : BasePresenterImpl<LoginContract.View>(), LoginContract.Presenter {

    private val composite by lazy { CompositeDisposable() }
    private val api by lazy { RetrofitService.create() }

    override fun deathView() {
        composite.clear()
    }

    override fun loadImage(context: Context) {

        ImageUtil.squareDrawableImage(mView!!.logo(), R.drawable.invalid_name, context)
    }

    override fun submitLogin(id: String, pw: String) {

        if (id.isEmpty() || pw.isEmpty()) {
            mView!!.toastMessage("빈칸을 확인해 주세요.")
            return
        }
        composite.add(login(id, pw))
    }

    private fun login(id: String, pw: String) = api.login(id, pw)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSuccess {
                if (it.result) {
                    mView!!.intentMain()
                } else {
                    mView!!.toastMessage("아이디 또는 비밀번호를 확인해 주세요.")
                }
            }
            .doOnError { it.printStackTrace() }
            .subscribe()
}