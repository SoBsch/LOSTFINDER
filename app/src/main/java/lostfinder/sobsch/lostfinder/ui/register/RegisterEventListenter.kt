package lostfinder.sobsch.lostfinder.ui.register

interface RegisterEventListenter {

    fun onAccent()  // 약관동의
    fun onCertification() // 본인인증
    fun onSignInUser()  // 아이디 입력
    fun onSignInAddress() // 주소 입력
    fun onRegisterDone() //  완료 페이지
    fun onRegisterFinish()    // 회원가입 페이지 종료

    fun popBack()
}