package com.example.daggerfirstapp

import android.app.Application
import com.example.daggerfirstapp.daggerfirstexample.AppComponent
import com.example.daggerfirstapp.daggerfirstexample.AppModule
import com.example.daggerfirstapp.daggerfirstexample.DaggerAppComponent
import com.example.daggerfirstapp.networkcalldemowithmodule.DaggerNetworkComponent
//import com.example.daggerfirstapp.daggerfirstexample.DaggerAppComponent
//import com.example.daggerfirstapp.networkcalldemowithmodule.Da
import com.example.daggerfirstapp.networkcalldemowithmodule.NetworkComponent
import com.example.daggerfirstapp.networkcalldemowithmodule.NetworkModule

class MyApplication: Application() {
    lateinit var  appComponent: AppComponent
    lateinit var networkComponent: NetworkComponent

    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
            .appModule(AppModule()).build()
        networkComponent= DaggerNetworkComponent.builder()
            .networkModule(NetworkModule()).build()
    }
}