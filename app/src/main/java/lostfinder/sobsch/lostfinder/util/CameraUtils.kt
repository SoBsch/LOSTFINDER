package lostfinder.sobsch.lostfinder.util

import android.hardware.Camera
import android.os.Environment
import android.provider.MediaStore
import lostfinder.sobsch.lostfinder.ui.stuff.fragment.camera.preview.CameraPreviewListener
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

object CameraUtils {

    // 카메라 사진 저장
    fun picktureTaken(data: ByteArray?, camera: Camera?, mCallback: CameraPreviewListener.PreviewFileListener) {

        val pictureFile = getOutputMediaFile(MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE)

        if (pictureFile == null) {
            return
        }
        //TODO 버퍼 체크해서 저장완료됬는지로 변경 ( 콜백을 완료되고 사용)
        try {
            val fos = FileOutputStream(pictureFile)

            fos.write(data)
            fos.close()

            mCallback.onFileWriteFinish(pictureFile.path)

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    // 저장 위치
    private fun getOutputMediaFile(type: Int): File? {

        val mediaStorageDir = File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), "LOSTFINDER")

        if (!mediaStorageDir.exists()) {

            if (!mediaStorageDir.mkdirs()) {
                return null
            }
        }

        val mediaFile: File

        mediaFile = when (type) {
            MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE -> File(StringUtil.nfcImageSavePath(mediaStorageDir.path))
            else -> return null
        }

        return mediaFile
    }
}