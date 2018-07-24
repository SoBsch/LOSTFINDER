package lostfinder.sobsch.lostfinder

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class LostFinderApplication: Application(){


    override fun onCreate() {
        super.onCreate()

        appLeakcanary()

    }

    private fun appLeakcanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }
}