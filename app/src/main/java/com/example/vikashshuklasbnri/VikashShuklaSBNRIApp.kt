package com.example.vikashshuklasbnri

import android.app.Application

class VikashShuklaSBNRIApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: VikashShuklaSBNRIApp
    }
}
