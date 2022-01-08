package com.example.myapplication.Kotlin

// 앨비스 연산자
fun main(args: Array<String>) {
    val number: Int? = 100
    val number2 = number ?:10
    println(number2)
}