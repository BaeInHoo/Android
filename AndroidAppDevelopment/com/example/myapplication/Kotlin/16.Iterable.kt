package com.example.myapplication.Kotlin

// 16. Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 반복하는 방법 (1)
    for (item in a) {
        if ( item == 5) println("item is five")
        else println("item is not five")
    }
    println()

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index :" + index + " value : " + item)
    }
    println()

    // 반복하는 방법 (3)
    a.forEach {     // lambda
        println(it)
    }
    println()

    // 반복하는 방법 (4)
    a.forEach { item ->
        println(item)
    }
    println()

    // 반복하는 방법 (5)
    a.forEachIndexed{ index, item ->
        println("index :" + index + " value :" + item)
    }
    println()

    // 반복하는 방법 (6)
    println(a.size)
    for ( i in 0 until a.size) {
        print(a.get(i))
        print(" ")
    }
    println()

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
        print(a.get(i))
        print(" ")
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) {
        print(a.get(i))
        print(" ")
    }
    println()

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)) {
        print(a.get(i))
        print(" ")
    }
    println()

    // 반복하는 방법(10)
    for ( i in 0.. a.size) {     // .. 은 마지막을 포함
        print(i)
        print(" ")
    }
    println("\n")

    // 반복하는 방법 (11)
    var c = 0
    var b = 4
    while (b > c) {
        c++
        print("c")
        print(" ")
    }
    println()

    // 반복하는 방법 (12)
    c = 0
    do {
        print("hello ")
        c++
    } while (b > c)
}