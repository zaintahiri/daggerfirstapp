package com.example.daggerfirstapp.daggerfirstexample

import javax.inject.Inject

class Engine @Inject constructor() {
    fun start()="Engin Starts"
}