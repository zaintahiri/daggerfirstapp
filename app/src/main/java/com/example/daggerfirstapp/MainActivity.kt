package com.example.daggerfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.daggerfirstapp.daggerfirstexample.Engine
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var engine: Engine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).appComponent.inject(this)
        println("Engine starts :"+engine.start())


    }

    fun  nextActivity(view: View){
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}