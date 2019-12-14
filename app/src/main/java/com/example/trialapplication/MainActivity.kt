package com.example.trialapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("trace", "MainActivity onCreate: start")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("trace", "MainActivity onStart: start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("trace", "MainActivity onResume: start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("trace", "MainActivity onRestart: start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("trace", "MainActivity onPause: start")
    }

    override fun onStop() {
        super.onStop()
        Log.d("trace", "MainActivity onStop: start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("trace", "MainActivity onDestroy: start")
    }

}
