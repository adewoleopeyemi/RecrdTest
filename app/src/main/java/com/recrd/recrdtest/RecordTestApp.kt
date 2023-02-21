package com.recrd.recrdtest

import android.app.Application
import com.recrd.recrdtest.di.AppModule
import org.koin.core.context.startKoin

class RecordTestApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                AppModule
            )
        }
    }
}