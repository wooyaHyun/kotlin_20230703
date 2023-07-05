package com.example.kotlinlab.ch11

open class SuperClass {
    fun some(){}
}

class Outer {
    val data1 = 10

    private val obj1 = object {//클래스명이 없다.. 타입을 명시하지도 않았다.. 이 객체는 Any 타입이다..
        //private 을 추가해서.. 이 outer 내에서만 사용된다고 보장만 해주면.. 컴파일러 기법으로.. 멤버들을 outer 에서 사용되게
        val data2 = 20
        fun some2(){
            println("$data1")
        }
    }
    fun some1() {
        println("${obj1.data2}")
        obj1.some2()

        obj2.some()//ok
//        obj2.some3()//error
    }

    val obj2 = object : SuperClass() {//이름은 없지만.. 상위, 인터페이스를 걸어서.. 선언.. 타입이 존재..
        fun some3(){}
    }

    //이름 없는 클래스의 객체를 선언과 동시에 객체 생성. NamedObject 라는 객체명으로 이용..
    //anonymous 클래스를 선언하는 개발자가.. 이 클래스의 객체 이름까지 명시할때..
    object NamedObject {
        fun some4(){}
    }

    companion object CompanionClass {
        var companionData = 0
        fun companionFun(){}
    }

    fun some4(){
        CompanionClass.companionData++
        companionData++
    }
}

fun main() {
    Outer.CompanionClass.companionData++
    Outer.companionData++
}