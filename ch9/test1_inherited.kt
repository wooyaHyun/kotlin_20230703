package com.example.kotlinlab.ch9

open class Super(no: Int) {
    constructor(no: Int, name: String): this(no){
        println("Super.. constructor(no: Int, name: String)")
    }
    init {
        println("Super.. init")
    }
}

class Sub(no: Int): Super(no, "kkang") {
    constructor(no: Int, name: String): this(no){
        println("Sub.. constructor(no: Int, name: String)")
    }
    init {
        println("Sub.. init")
    }
}

fun main() {
    val obj = Sub(10, "kim")

    val obj2: Super = obj//암시적 캐스팅... 하위->상위..
    val obj3: Sub = obj2 as Sub//상위 -> 하위.. 명시적 캐스팅..
}