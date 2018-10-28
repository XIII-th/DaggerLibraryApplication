package com.xiii.daggerlibraryapplication

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by XIII-th on 28.10.2018
 */
@Component(modules = [AndroidSupportInjectionModule::class, MainActivityModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        // unused in this sample
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}