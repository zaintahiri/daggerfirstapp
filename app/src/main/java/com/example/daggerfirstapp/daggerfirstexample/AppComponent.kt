package com.example.daggerfirstapp.daggerfirstexample

import com.example.daggerfirstapp.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}