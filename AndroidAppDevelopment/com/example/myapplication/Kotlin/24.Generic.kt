package com.example.myapplication.Kotlin

// 24. Generic
// 목적: 타입을 체크하는 기능
// - 제너릭 만들기 어렵고 만들일 없어 사용하는 방법만

fun main(array: Array<String>) {
    // 제너릭을 사용하지 않은 경우
    val list1 = listOf(1, 2, 3, "가")
    val b : String = list1[2].toString()    // 형변환

    // 제너릭을 사용하는 경우 -> 타입이 안전하다
    val list2 = listOf<String>("a", "b", "c")
    val c : String = list2[2]   // String이라는 것을 보장 받음

    // 강한 타입을 체크할 수 있다
    val list3 = listOf(1, 2, 3, 4, "a", "b", 3.0)
//    val list4 = listOf<Int>(1, 2, 3, "a") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우(2)
    val list5 = listOf<Any>(1,2,3,"a") // -> Any
    // 부모 : Any
    // 자식 : String, Int, Float

}