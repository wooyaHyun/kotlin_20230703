package com.example.kotlinlab.ch3.one

import java.util.Date

//가상의 package 가능...

class MyFile {
    val data = 10
    fun some() {

    }
}

//top level 에 class 이외에 변수, 함수 선언 가능..
val data = 20;
fun printData() {
    //함수가 클래스보다 더 큰 단위의 프로그램 가능..
    //함수내에.. 함수, 변수, 클래스 선언 가능..
    //==>First Class Citizen 으로서 함수가 이용이 가능하다..

    val data = Date()//kotlin 은 new 라는 연산자가 없다..
    fun some() { } //local function 이어서 외부에서 직접 호출은 불가하지만.. 이 함수를 outer 함수에서 다른곳에 리턴만 시켜준다면.

    class MyClass {
        //변수, 함수..
    }
}

//top level 에 변수, 함수...
//컴파일 되면.. 자바 클래스가 된다. 자바에서는 top level 에 클래스만 가능.. 모든 변수, 함수는 클래스내에 선언되어야 한다..
//자바 클래스로 만들어 질때는 top level 의 변수, 함수가.. 파일명+Kt 클래스의 static 멤버로 들어간다..
//코틀린에서 사용할 때는 파일명+Kt 이용 불가..












