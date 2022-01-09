package com.example.myapplication.Kotlin

fun main(array: Array<String>) {

    val array = arrayOf(1, 2, 3)

    val number = array.get(0)
    println(number)
//    val number1 = array.get(100)    // error

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    // 배열 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b') // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 3.4)
    val a4 = booleanArrayOf(true, false)

    // 배열 만드는 방법(4)
    var a5 = Array(10, {0}) // lambda
    var a6 = Array(5, {1;2;3;4;5})
}