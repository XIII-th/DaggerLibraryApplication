package com.xiii.camera

import javax.inject.Scope

/**
 * Created by XIII-th on 25.10.2018
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.CLASS])
annotation class CameraScope