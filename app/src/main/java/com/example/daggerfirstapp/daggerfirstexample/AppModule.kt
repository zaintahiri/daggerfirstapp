package com.example.daggerfirstapp.daggerfirstexample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun getEngine(): Engine {
      return Engine()
    }
}