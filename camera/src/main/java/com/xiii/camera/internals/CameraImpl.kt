package com.xiii.camera.internals

import com.xiii.camera.Camera
import javax.inject.Inject

/**
 * Created by XIII-th on 28.10.2018
 */
// Camera implementation. All dependencies also must be internal
internal class CameraImpl @Inject constructor(
        private val selector: CameraSelector
) : Camera {

    override fun init() {
        val cameraId = selector.getCameraId()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}