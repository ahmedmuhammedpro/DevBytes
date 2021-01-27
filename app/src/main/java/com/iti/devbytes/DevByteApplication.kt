package com.iti.devbytes

import android.app.Application
import timber.log.Timber

class DevByteApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}