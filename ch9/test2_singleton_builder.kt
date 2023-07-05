package com.example.kotlinlab.ch9

//singleton.. 하나의 객체만 생성되어 이용되게 강제..
//주 생성자의 constructor 는 생략이 가능하지만.. 다른 예약어가 추가된다면 붙혀야..
class Singleton private constructor(){
    var data: Int = 0
    //내부에서 객체를 하나만 생성하고.. 그 객체를 외부에서 이용하게 한다..
    //그 객체를 외부에서 객체 생성없이 획득.. 자바에서는 static 으로 선언한다..
    //kotlin 에는 static 예약어가 없다..
    //top level 에 변수 선언.. static 대체목적이기는 하지만.. 경우에 따라.. 어떤 클래스에 선언된 맴버가..
    //자바처럼  static 으로 이용되게 하고 싶은경우도 있다..
    //그런 멤버를 위해서 제공되는 것이.. companion object 클래스가 제공된다..
    //companion object 안에 선언된 멤버는 outer 클래스의 static 멤버처럼 이용된다..
    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

//Builder... 객체생성 대행자..
class Target private constructor(){
    var data = 0

    companion object Builder {
        fun getInstance(): Target {
            return Target()
        }
    }
}

fun main() {
    val obj1 = Singleton.instance
    val obj2 = Singleton.instance
    obj1.data = 10
    obj2.data = 20
    println("${obj1.data}, ${obj2.data}")//20, 20

    val builder = Target.Builder
    val obj3 = builder.getInstance()
    val obj4 = builder.getInstance()
    obj3.data = 10
    obj4.data = 20
    println("${obj3.data}, ${obj4.data}")//10, 20

}