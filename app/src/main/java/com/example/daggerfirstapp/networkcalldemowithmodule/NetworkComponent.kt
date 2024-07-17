package com.example.daggerfirstapp.networkcalldemowithmodule

import com.example.daggerfirstapp.SecondActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DataBaseModule::class])
interface NetworkComponent {
    fun inject(secondActivity: SecondActivity)
}