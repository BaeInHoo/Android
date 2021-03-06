package com.example.myapplication.Kotlin

// 10. 제어 흐름

// when

fun main(args: Array<String>) {

    val value: Int  = 3

    when(value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I don't know value")
        }
    }

    val value2= when(value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println()
    println(value2)
}