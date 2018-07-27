# 로스트 파인더

## 안드로이드 어플리케이션 소스코드 저장소

### [체크리스트](https://github.com/SoBsch/LOSTFINDER/blob/master/documents/checklist.md)


### Setting

* CompileSdk `28`
* Kotlin Version `1.2.50`
* Android Studio `3.1.3`



### Library

* SupportLibrary `28.0.0-alpha3`
* ConstraintLayout `1.1.2`
* RxAndroid `2.0.2`
* RxJava2 `2.1.12`
* Anko `0.10.5`
* Retrofit2 `2.4.0`
* Okhttp3 `3.10.0`
* LeakCanary `1.5.4`
* Glide `4.7.1`

### Design Pattern

* MVP Pattern


### Class

* 스플래시 `미구현`

* 로그인 - Login `Activity`
* 회원가입 - Register `FragmentActivity`
  * `Fragment`
  * main 
  * accent -> `event` -> AccentInfo
  * certification
  * sign-in 
  * address -> `event` -> FindAddress
  * done
  
  * 약관페이지 - AccentInfoActivity `Activity`
  * 주소검색 - FindAddressActivity `Activity`
  
* 메인화면 - MainActivity `Activity` ( ViewPager, Tablayout, NavigationDrawer)
  * `Fragment`
  * home 
  * message
  * mypage
