package com.example.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LogApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}