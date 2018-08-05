package lostfinder.sobsch.lostfinder.util

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat

object PermissionUtil {

    class CameraPermission(val context: Context, private val activity: Activity) {

        private val isCameraPermission = ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)
        private val isWriteExternalStoregePermission = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)

        @RequiresApi(Build.VERSION_CODES.M)
        fun isPermissionGranted(isGranted: (Boolean) -> Unit) {
            // 권한 없음
            if (isCameraPermission != PackageManager.PERMISSION_GRANTED &&
                    isWriteExternalStoregePermission != PackageManager.PERMISSION_GRANTED) {

                // ActivityCompat.requestPermissions(activity, arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE), 0)
                // 프래그 먼트일경우 ActivityCompat 제거

                activity.requestPermissions(arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE), 0)
                isGranted(false)
            } else {    // 있음
                isGranted(true)

            }
        }
    }
}