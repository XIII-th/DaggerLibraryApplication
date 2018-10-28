package com.xiii.camera.internals

import com.xiii.camera.Camera
import com.xiii.camera.CameraScope
import dagger.Binds
import dagger.Module

/**
 * Created by XIII-th on 28.10.2018
 */
@Module
internal interface CameraModule {

    @Binds
    @CameraScope
    fun getSelector(impl: CameraSelectorImpl): CameraSelector

    @Binds
    @CameraScope
    fun getCamera(impl: CameraImpl): Camera
}