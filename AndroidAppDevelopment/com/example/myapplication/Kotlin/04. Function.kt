package com.example.myapplication.Kotlin

// 04. Function
// - 함수
//      - 어떤 input 을 넣어주면 어떤 output 나오는 것
//      - y = x + 2

// - 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ....) : 반환형 {
//     함수 내용
//     return 반환값
// }

fun plus(first: Int, second: Int) : Int {
    val result: Int = first + second
    return result
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int{
    val result : Int = first + second
    return result
}

fun main(array: Array<String>) {
    val result = plus(5, 10)    // 함수를 호출하는 방법
    println(result)

    val result2 = plus(first = 20, second = 30) // 인수를 명시적으로 전달하는 방법
    println(result2)

    println()
    val result3 = plusFive(10, 20)  // 디폴트 값을 갖는 함수 호출하기
    println(result3)
    val result4 = plusFive(10)
    println(result4)
}

