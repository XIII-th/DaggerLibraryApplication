package com.xiii.daggerlibraryapplication

import com.xiii.camera.CameraComponent
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by XIII-th on 28.10.2018
 */
// I'm not completely sure subcomponents is used here proper way
@Module(includes = [AndroidSupportInjectionModule::class], subcomponents = [CameraComponent::class])
interface MainActivityModule {

    // https://google.github.io/dagger/android
    //Pro-tip: If your subcomponent and its builder have no other methods or supertypes than the ones mentioned in step
    // #2, you can use @ContributesAndroidInjector to generate them for you. Instead of steps 2 and 3, add an abstract
    // module method that returns your activity, annotate it with @ContributesAndroidInjector, and specify the modules
    // you want to install into the subcomponent. If the subcomponent needs scopes, apply the scope annotations to the
    // method as well.
    @ContributesAndroidInjector
    // If I make CameraModule public, I need to make public CameraImpl and so on
    // @ContributesAndroidInjector(modules = [CameraModule::class])
    fun inject(): MainActivity
}