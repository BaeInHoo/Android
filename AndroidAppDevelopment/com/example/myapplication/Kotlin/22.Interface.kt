package com.example.myapplication.Kotlin


// 22. Interface
// - 인터페이스는 약속
// - 생성자가 없다 -> 인스턴스화 시킬수 없다 -> 설명서가 아니다
// - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라

fun main(array: Array<String>) {
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()

}

interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }

}

class SoccerPlayer : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }

}


open class Person() {
    open fun eat() {

    }
    fun sleep() {

    }
}

class Student() : Person() {

}

class Teacher() : Person() {

}