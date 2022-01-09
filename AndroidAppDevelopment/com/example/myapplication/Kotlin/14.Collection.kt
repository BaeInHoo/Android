package com.example.myapplication.Kotlin

// 14. Collection
// -> list, set, map

// List

fun main(args: Array<String>) {

    // Immutable Collection
    // List
    val numberList = listOf<Int>(1, 2, 3) // 중복 허용 O
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    println()

    // Set
    // -> 순서가 없다
    val numberSet = setOf<Int>(1, 2, 3, 4, 4) // 중복 허용 X
    println(numberSet)
    numberSet.forEach {
        print(it)
    }
    println()

    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))
    println()
    println()


    // Mutable Collection
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2 , 3, 3)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)


}