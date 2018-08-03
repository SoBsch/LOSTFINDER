package lostfinder.sobsch.lostfinder.util

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat

object PermissionUtil {

    class CameraPermission(val context: Context, private val activity: Activity, private val callback: () -> Unit) {

        fun isPermissionGranted() {
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.CAMERA), 0)
            } else {
                callback()
            }
        }
    }
}