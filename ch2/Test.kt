package com.example.kotlinlab.ch2

//kotlin 은 파일 명과.. 그 파일에 선언되는 클래스명과의 규칙이 없다..
fun main() {
    //kotlin 은 ; 을 강제하지 않는다..
    println("hello world")

    var result = listOf(10, 5, 30).last {
        it % 5 == 0
    }
    println("last test : $result")
}