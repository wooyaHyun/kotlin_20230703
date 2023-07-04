package com.example.kotlinlab.ch6

fun main() {
    //if test.............
    fun ifTest(arg: Int){
        //if 를 expression 으로 활용할 수 있다..
        //expression 으로 이용한다면 else 생략 불가..
        //마지막 라인의 실행 결과값이 저장된다..
        val result = if(arg>10){
            println("arg>10")//이 함수의 리턴 타입은 Unit 이다.. 개발자에 의해 명시적인 return 은 없지만.. 타입이다..
            arg
        }else if(arg>100){
            println("arg>100")
            100
        }else {
            println("arg<=10")
            0
        }

        println("result : $result")

        println(if(result != null) "good.." else "bad...")//자바의 3항 연산자처럼..
        val a = "hello ${if(result != null) "g" else "b"} world"
    }
    ifTest(20)

    fun a(arg: Int) = if(arg>10) {
        10
    }else{
        0
    }
    fun b(arg: Int) = when(arg){
        10 -> println("aa")
        else -> 0
    }

    fun forTest(){
        for(i in 1..5){
            print(i)
        }
        println()
        for(i in 10 downTo 1 step 2){
            print(i)
        }

        val array = arrayOf("hello", "world")
        for((index, value) in array.withIndex()){
            println("$index - $value")
        }

        val map = mapOf<String, String>("one" to "hello", "two" to "world")
        for(item in map){
            println("${item.key} - ${item.value}")
        }
    }
    forTest()
}