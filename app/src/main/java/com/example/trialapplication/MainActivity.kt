package com.example.trialapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("trace", "MainActivity onCreate: start")
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.move_linear_layout_button)
        button.setOnClickListener { onClickMove() }
    }

    private fun onClickMove() {
        Log.d("trace", "MainActivity onClick: start")
        val intent = Intent(this, LinearLayoutActivity::class.java)
        startActivity(intent)
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
