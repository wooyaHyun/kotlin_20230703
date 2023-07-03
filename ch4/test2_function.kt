package com.example.kotlinlab.ch4

fun sum(start: Int = 1, end: Int = 10, result: Int = 0): Int {
    if(start > end) return result
    else return sum(start + 1, end, result + start)
}

tailrec fun sum1(start: Int = 1, end: Int = 10, result: Int = 0): Int {
    if(start > end) return result
    else return sum1(start + 1, end, result + start)
}

fun main() {
    //optional 과... named parameter 만 지원이 된다면.. 과도하게 오버로딩으로 함수를 여러개 선언할 필요가 없다..
    fun sayHello(arg1: Int, arg2: String = "kkang") = println("arg1 : $arg1, arg2 : $arg2")

    sayHello(10)
    sayHello(10, "kim")
    sayHello(arg2 = "lee", arg1 = 20)


    //가변인수는 함수 내에서는 배열취급이 된다..
    //하지만.. 이 함수를 호출하는 곳에서 배열로 대입하는 것은 아니고..
    fun varargFun(arg1: Int, vararg args: Int){
        for(a in args){//자바 스타일의 for( ; ; ) 은 지원하지 않는다..
            //in 범위 연산자..
            print("args: $a ")
        }
    }
    varargFun(10, 20, 30, 40)

    println("sum : ${sum(end = 10)}")
    println("sum1 : ${sum1(end = 10)}")
}