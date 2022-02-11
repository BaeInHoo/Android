package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.TextView

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet)

        val address_edit_text : TextView = findViewById(R.id.address_edit_text)
        val open : TextView = findViewById(R.id.open)

        open.setOnClickListener {
            val address = address_edit_text.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        address_edit_text.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "beforeTextChanged : " + p0)
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "onTextChanged : " + p0)
            }

            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString() == "abc") {
                    Log.d("edit", "text is abc")
                }

                Log.d("edit", "afterTextChanged : " + p0)
            }
        })
    }
}