package com.xiii.camera

import android.app.Activity
import com.xiii.camera.internals.CameraModule
import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Created by XIII-th on 28.10.2018
 */
// Ideally, to inject camera by this subcomponent if it's possible
// Provide Camera by CameraModule also acceptable, but only one Camera provider must to be
@Subcomponent(modules = [CameraModule::class])
interface CameraComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        // Activity is not used in this sample, but in real app it will be used to obtain display characteristics
        fun activity(activity: Activity): Builder
        fun builder(): CameraComponent
    }
}