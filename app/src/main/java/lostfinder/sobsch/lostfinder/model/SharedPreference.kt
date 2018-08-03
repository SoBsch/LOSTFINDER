package lostfinder.sobsch.lostfinder.model

import android.content.Context
import android.content.SharedPreferences

class SharedPreference(context: Context) {

    private val PREFS_FILENAME = "prefs"
    private val AUTO_LOGIN = "login"
    private val AUTO_ID = "id"
    private val AUTO_PASSWORD = "password"

    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

    fun setAutoLogin() {
        val edit = prefs.edit()

        if (prefs.getBoolean(AUTO_LOGIN, false)) {
            edit.putBoolean(AUTO_LOGIN, true)
        } else {
            edit.putBoolean(AUTO_LOGIN, false)
        }

        edit.apply()
    }

    // 로그인되있는 사용자인지
    fun isLogined(): Boolean {
        return prefs.getBoolean(AUTO_LOGIN, false)
    }

    fun setUserId(id: String, password: String) {
        val edit = prefs.edit()
        edit.putString(AUTO_ID, id)
        edit.putString(AUTO_PASSWORD, password)
        edit.apply()
    }
}