package com.example.kotlinlab.ch7

class User(val id: String, var name: String) {
    var email: String? = null

    //주 생성자가 선언이 되어 있다면.. 무조건 보조생성자로 객체 생성했을때.. 주 생성자 호출되게 해야 한다..
    constructor(id: String, name: String, email: String): this(id, name){
        println("construcotr : $id, $name, $email")
        this.email = email
    }
    //직접 주생성자를 호출하지 않는다고 하더라도.. 어떻게 하든.. 주생성자가 실행되게 해주면된다..
    constructor(id: String, name: String, email: String, address: String): this(id, name, email){

    }

    init {
        println("init : $id, $name, $email")
    }
    fun some() {
        println("some : $id, $name, $email")
    }
}

fun main() {
    val obj = User("1", "kim", "a@a.com")
}