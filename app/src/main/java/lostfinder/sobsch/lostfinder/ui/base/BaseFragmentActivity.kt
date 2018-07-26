package lostfinder.sobsch.lostfinder.ui.base

import android.os.Bundle
import android.support.v4.app.FragmentActivity

abstract class BaseFragmentActivity<in V : BaseView, T : BasePresenter<V>> : FragmentActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResID())
        mPresenter.attachView(this as V)

        init()
    }

    protected abstract var mPresenter: T


    override fun onResume() {
        super.onResume()
        resume()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.deathView()
        destroy()

    }

    override fun onPause() {
        super.onPause()
        pause()
    }

    abstract fun getResID(): Int

    abstract fun init()

    abstract fun resume()

    abstract fun pause()

    abstract fun destroy()
}