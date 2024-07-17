package com.example.daggerfirstapp.networkcalldemowithmodule

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun getDataBaseObject():DataBaseService=DataBaseService()
}