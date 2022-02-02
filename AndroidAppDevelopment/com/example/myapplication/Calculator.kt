package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // new -> old (new + old)
        var new = "0"
        var old = "0"

        val cal_result : TextView = findViewById(R.id.cal_result)

        val cal_one : TextView = findViewById(R.id.cal_one)
        cal_one.setOnClickListener {
            new = new + "1"
            cal_result.setText(new)
        }
        val cal_two : TextView = findViewById(R.id.cal_two)
        cal_two.setOnClickListener {
            new = new + "2"
            cal_result.setText(new)
        }
        val cal_three : TextView = findViewById(R.id.cal_three)
        cal_three.setOnClickListener {
            new = new + "3"
            cal_result.setText(new)
        }
        val cal_four : TextView = findViewById(R.id.cal_four)
        cal_four.setOnClickListener {
            new = new + "4"
            cal_result.setText(new)
        }
        val cal_five : TextView = findViewById(R.id.cal_five)
        cal_five.setOnClickListener {
            new = new + "5"
            cal_result.setText(new)
        }
        val cal_six : TextView = findViewById(R.id.cal_six)
        cal_six.setOnClickListener {
            new = new + "6"
            cal_result.setText(new)
        }
        val cal_seven : TextView = findViewById(R.id.cal_seven)
        cal_seven.setOnClickListener {
            new = new + "7"
            cal_result.setText(new)
        }
        val cal_eight : TextView = findViewById(R.id.cal_eight)
        cal_eight.setOnClickListener {
            new = new + "8"
            cal_result.setText(new)
        }
        val cal_nine : TextView = findViewById(R.id.cal_nine)
        cal_nine.setOnClickListener {
            new = new + "9"
            cal_result.setText(new)
        }
        val cal_zero : TextView = findViewById(R.id.cal_zero)
        cal_zero.setOnClickListener {
            new = new + "0"
            cal_result.setText(new)
        }

        val cal_clear : TextView = findViewById(R.id.cal_clear)
        cal_clear.setOnClickListener {
            var new = "0"
            var old = "0"
            cal_result.setText("0")
        }
        val cal_plus : TextView = findViewById(R.id.cal_plus)
        cal_plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            cal_result.setText(old)
        }


    }
}