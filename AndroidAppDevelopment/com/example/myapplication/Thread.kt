package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.lang.Thread

class Thread : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val thread_button : TextView = findViewById(R.id.thead_button)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread: Thread = Thread(runnable)
        thread_button.setOnClickListener {
            thread.start()
        }

        Thread(object : Runnable{
            override fun run() {
                Log.d("thead-1", "Thread2 is made")
            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thead-1", "Thread3 is made")
            runOnUiThread{
                thread_button.setBackgroundColor(getColor(R.color.text_color))
            }
        }).start()



    }
}