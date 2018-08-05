package lostfinder.sobsch.lostfinder.ui.stuff

interface StuffEventListener {

    fun onCamera()

    fun onWrite(path: String)

    fun onSubmit()
    fun onBack()

}