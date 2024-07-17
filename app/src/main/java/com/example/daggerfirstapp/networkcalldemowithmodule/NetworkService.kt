package com.example.daggerfirstapp.networkcalldemowithmodule

import javax.inject.Inject

class NetworkService @Inject constructor() {
    fun fetchData():String{
        return "Data is fetched from service"
    }
}