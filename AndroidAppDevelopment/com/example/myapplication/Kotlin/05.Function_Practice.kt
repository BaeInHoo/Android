package com.example.myapplication.Kotlin

fun plusThree(first: Int, second:Int, third:Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int =1, third: Int =1) : Int {
    return first * second * third
}

// 내부 함수
// - 함수 안에 함수가 있음
fun showMyPlus(first: Int, second: Int) : Int {
    fun plus(first: Int, second: Int) : Int {
        return first + second
    }
    return plus(first, second)
}


fun main(array: Array<String>) {
    val result1 = plusThree(10, 20, 30)
    println(result1)
    println()

    val result2 = minusThree(30, 20, 10)
    println(result2)
    println()

    val result3 = multiplyThree(2,2,2)
    println(result3)

    val result4 = multiplyThree()
    println(result4)
    println()

    val result5 = showMyPlus(4, 5)
    println(result5)

}