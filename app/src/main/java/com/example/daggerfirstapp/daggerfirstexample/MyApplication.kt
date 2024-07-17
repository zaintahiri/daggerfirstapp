package com.example.daggerfirstapp.daggerfirstexample

import android.app.Application
import com.example.daggerfirstapp.daggerfirstexample.DaggerAppComponent

class MyApplication: Application() {
    lateinit var  appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
            .appModule(AppModule()).build()
    }
}