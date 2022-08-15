package com.example.nfctest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber

class AppNfcTest : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        startKoin{
            androidContext(this@AppNfcTest)
            modules(appTestModule)
        }
    }

    private val appTestModule = module {
        viewModel { MainViewModel() }
    }
}