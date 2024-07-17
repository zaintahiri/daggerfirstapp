package com.example.daggerfirstapp

import android.app.Application

class MyApplication: Application() {
    lateinit var  appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.builder()
            .appModule(AppModule()).build()
    }
}