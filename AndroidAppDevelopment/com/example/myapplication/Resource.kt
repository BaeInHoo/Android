package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.myapplication.R

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.text_hello)
        Log.d("r_ment", "ment : " + ment)

        // 2
        val ment2 = getString(R.string.text_hello)
        Log.d("r_ment", "ment" + ment2)

        val color = getColor(R.color.text_color)
        Log.d("r_ment", "color : " + color)

        val button : TextView = findViewById(R.id.resource_button)

        // SDK 버전에 따른 분기 처리
        val color2 = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            button.setBackgroundColor(getColor(R.color.text_color))
        } else {
            button.setBackgroundColor(resources.getColor(R.color.text_color))
        }
    }
}