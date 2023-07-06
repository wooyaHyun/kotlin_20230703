package com.example.kotlinlab.ch13

fun main() {
    //첫번째 매개변수로 데이터 집합... 필터링 알고리즘은... 외부에서 매개변수로 전달하라.. 함수..
    fun myFilter(list: List<Int>, argFun: (Int)->Boolean): List<Int>{
        val resultList = mutableListOf<Int>()
        val iterator = list.iterator()
        while (iterator.hasNext()){
            val no = iterator.next()
            val result = argFun(no)
            if(result){
                resultList.add(no)
            }
        }
        return resultList
    }

    val testList = listOf<Int>(10, 13, 3, 6, 20)
    val resultList = myFilter(testList){ it > 10 }
    resultList.forEach { println(it) }

    class User {
        var name = "kim"
        fun sayHello() {}
    }
    val obj = User()
    obj.run {
        name = "lee"
        sayHello()
    }
    with(obj){
        name = "kkang"
        sayHello()
    }
}