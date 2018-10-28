package com.xiii.daggerlibraryapplication

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by XIII-th on 28.10.2018
 */
class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}