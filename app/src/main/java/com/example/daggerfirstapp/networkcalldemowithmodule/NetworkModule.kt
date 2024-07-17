package com.example.daggerfirstapp.networkcalldemowithmodule

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun getNetworkService():NetworkService{
        return  NetworkService()
    }
}