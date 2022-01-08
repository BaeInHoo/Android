package com.example.myapplication.Kotlin

// 11. 제어 흐름 실습

fun main(args: Array<String>) {

    val value : Int? = null

    when(value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    val value3 = when(value2) {
        false -> 1
        true -> 0
        null -> null
    }
    println()
    println(value3)

    // 다양한 조건식 (1)
    val value4: Int  = 10
    when (value4) {
        is Int -> println("value4 is Int")
        else -> println("value4 is not Int")
    }

    // 다양한 조건식 (2)
    val value5: Int = 87
    when (value5) {
        in 60..70 -> println("60 < value5 < 70")
        in 70..80 -> println("70 < value5 < 80")
        in 80..90 -> println("80 < value5 < 90")
        in 90..100 -> println("90 < value5 < 100")

    }
}