package lostfinder.sobsch.lostfinder.util.preview

import android.hardware.Camera

interface CameraPreviewListener{

    fun setCamera(camera: Camera,
                  cameraInfo: Camera.CameraInfo,
                  displayOrientation: Int)

    interface PreviewFileListener{

        fun onFileWriteFinish(path: String)
    }
}