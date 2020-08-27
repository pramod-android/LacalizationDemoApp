package com.marathideveloper.lacalizationdemoapp

import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.os.LocaleList
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.lang.String.format
import java.util.*

// extend class Activity_Base() to change language programmatically
//Activity_Base()

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var result = LocaleList.getDefault()

        Log.i("log","onCreate")


    }
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(ApplicationLanguageHelper.wrap(newBase!!, "mr"))
        Log.i("log","attachBaseContext")
    }


}