package com.example.daggerfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerfirstapp.networkcalldemowithmodule.DataBaseService
import com.example.daggerfirstapp.networkcalldemowithmodule.NetworkService
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var networkService: NetworkService
    @Inject
    lateinit var dataBaseService: DataBaseService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        (application as MyApplication).networkComponent.inject(this)
        println("Network data :"+networkService.fetchData())
        println("Database data :"+dataBaseService.getData())
    }
}