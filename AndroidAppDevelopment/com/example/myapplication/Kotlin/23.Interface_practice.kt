package com.example.myapplication.Kotlin

fun main(array: Array<String>) {
    val student1 = Student1()
    student1.sleep()
}

interface Person1 {
    fun eat() {
        println("EAT")
    }
    fun sleep() {
        println("SLEEP")
    }
    abstract fun study()
}

class Student1 : Person1 {
    override fun study() {

    }
}

class SoccerPlayer1 : Person1 {
    override fun study() {

    }
}