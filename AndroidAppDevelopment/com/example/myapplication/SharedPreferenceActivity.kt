package com.example.myapplication

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference 에 저장하는 방법
        val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)
        // MODE
        // - MODE_PRIVATE : 생성한 application에서만 사용 가능
        // - MODE_WORLD_READABLE : 다른 application 사용 가능 -> READ만 가능
        // - MODE_WORLD_WRITEABLE : 다른 application 사용 가능 -> 기록도 가능
        // - MODE_MULTI_PROCESS :  이미 호출되어 사용중인지 체크
        // - MODE_APPEND : 기존 preference에 신규로 추가
//        val editor : SharedPreferences.Editor = sharedPreference.edit()
//        editor.putString("hello", "안녕하세요")
//        editor.commit()

        // sp1 -> Sharedpreference
        //        (Key, Value) -> ("Hello", "안녕하세요")
        // sp2 -> Sharedpreference
        //        (Key, Value) -> ("Hello", "안녕하세요11")

        save_button.setOnClickListener{
            val editor : SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodbye", "안녕히가세요")
            editor.commit()
        }

        load_button.setOnClickListener{
            // SharedPreference에 값을 불러오는 방법
            val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "No Data 1")
            val value2 = sharedPreference.getString("goodbye", "No Data 2")
            Log.d("key-value", "Value 1 :" + value1)
            Log.d("key-value", "Value 2 :" + value2)
        }

        delete_all_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()
            editor.commit()
        }
    }
}