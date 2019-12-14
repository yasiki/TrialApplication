package com.example.trialapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_linear_layout.*

class LinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("trace", "LinearLayoutActivity onCreate: start")
        setContentView(R.layout.activity_linear_layout)

        change_activity_button.setOnClickListener { onClickChangeActivity() }
    }

    private fun onClickChangeActivity() {
        Log.d("trace", "LinearLayoutActivity onClickChangeActivity: start")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("trace", "LinearLayoutActivity onStart: start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("trace", "LinearLayoutActivity onResume: start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("trace", "LinearLayoutActivity onRestart: start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("trace", "LinearLayoutActivity onPause: start")
    }

    override fun onStop() {
        super.onStop()
        Log.d("trace", "LinearLayoutActivity onStop: start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("trace", "LinearLayoutActivity onDestroy: start")
    }
}