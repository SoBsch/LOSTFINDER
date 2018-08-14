package lostfinder.sobsch.lostfinder.util

import java.io.File
import java.text.SimpleDateFormat
import java.util.*

object StringUtil {

    fun dateImageName(): String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())

    fun nfcImageSavePath(path: String): String = path + File.separator + "IMG_" + dateImageName() + ".png"

    fun isEmailValid(email: CharSequence): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}