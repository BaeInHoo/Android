package com.example.myapplication.Mytube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_mytube_detail.*

class MytubeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mytube_detail)

        val url = intent.getStringExtra("video_url")

        val mediaController = MediaController(this@MytubeDetailActivity)
        mytube_video.setVideoPath(url)
        mytube_video.requestFocus()
        mytube_video.start()
        mediaController.show()

        // Exoplayer
        // drm -> digital right management
    }
}