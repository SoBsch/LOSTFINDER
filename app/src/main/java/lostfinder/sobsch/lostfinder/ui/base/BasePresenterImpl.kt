package lostfinder.sobsch.lostfinder.ui.base

open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {

    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun deathView() {
    }


}