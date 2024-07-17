package com.example.daggerfirstapp.networkcalldemowithmodule

import javax.inject.Inject

class DataBaseService @Inject constructor() {

    fun getData():String="Data from database"
}