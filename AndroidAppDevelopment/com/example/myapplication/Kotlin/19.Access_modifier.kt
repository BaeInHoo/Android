package com.example.myapplication.Kotlin

// 19. 접근 제어자

fun main(array: Array<String>) {

    // private 때문에 외부에서 사용 불가
    val testAccess: TestAccess = TestAccess("아무개")
//    testAccess.test()
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

}

class Reward() {
    var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    private fun test() {
        println("테스트")
    }
}