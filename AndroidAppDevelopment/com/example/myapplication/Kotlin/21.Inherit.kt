package com.example.myapplication.Kotlin

// 두번 이상 넘어가면 리펙토링

// 21. 상속
// 부모로부터 설명서를 물려받음

fun main(array: Array<String>) {
    val superCar10: SuperCar10 = SuperCar10()
    superCar10.drive()
    superCar10.stop()

    val bus10: Bus10 = Bus10()
    bus10.drive()

}

// 부모 : Car10
// 자식 : SuperCar10, Bus10
open class Car10() {
    open fun drive() {
        println("달린다")
    }
    open fun stop() {

    }
}

class SuperCar10() : Car10() {
    override fun drive() {
        println("빨리 달린다")
    }
}

class Bus10() : Car10() {

}