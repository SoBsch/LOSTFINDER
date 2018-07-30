package lostfinder.sobsch.lostfinder

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import lostfinder.sobsch.lostfinder.model.SharedPreference

class LostFinderApplication : Application() {

    companion object {

        lateinit var prefs: SharedPreference
    }

    override fun onCreate() {
        super.onCreate()

        appLeakcanary()

        prefs = SharedPreference(applicationContext)
    }

    private fun appLeakcanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }
}