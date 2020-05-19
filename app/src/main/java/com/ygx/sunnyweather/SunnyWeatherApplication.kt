package com.ygx.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application(){

    companion object {
        lateinit var context: Context
        const val TOKEN = "C7SvshmUDC43cOVY"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext;
    }

}