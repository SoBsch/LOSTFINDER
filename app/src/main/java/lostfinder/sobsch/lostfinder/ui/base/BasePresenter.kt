package lostfinder.sobsch.lostfinder.ui.base

interface BasePresenter<in V : BaseView> {

    fun attachView(view: V)

    fun deathView()
}