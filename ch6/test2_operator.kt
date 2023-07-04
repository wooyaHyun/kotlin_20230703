package com.example.kotlinlab.ch6

fun main() {
    //전개 연산자...
    val array1 = arrayOf(10, 20, 30)
    val array2 = arrayOf(40, 50, 60)

    val array3 = arrayOf(*array1, *array2)
    //람다함수는 원래.. { 매개변수 -> 함수내용 } 표현식이다..
    //-> 왼쪽에 매개변수를 명시.. 변수명, 타입 { arg: Int ->  }
    //만약 매개변수가 하나짜리 람다함수라면.. 매개변수 부분을 생략하고..매개변수를 람다함수내에서 it 으로 대체..
    //it 은 람다함수내에서만 예약어..
    //매개변수 여러개는 안된다..
    array3.forEach {
        println(it)//{ }  람다함수 호출하면서 전달한 매개변수..
    }

    //비교 연산자...
    class User
    val user1 = User()
    val user2 = User()
    val user3: User? = User()
    val user4 = user1
    //일반 객체는 ==, === 차이가 없다.. 동일 객체인지 비교..
    //? 에 의한 boxing 효과 없다.. boxing 효과는 기초타입의 객체 이야기다..
    //일반 객체 비교 : false, false, false, true
    println("일반 객체 비교 : ${user1==user2}, ${user1===user2}, ${user1==user3}, ${user1==user4}")

    val no1 = 1000
    val no2 = 1000
    val no3: Int? = 1000
    val no4: Int? = 1000
    //기초 타입 객체 : true, true, true, false
    //기초 타입 - non-null : 자바에서 int 타입이다.. 값비교.. (==. === 차이 없다.. 값 비교)
    //기초 타입 - nullable : 자바에서 Integer 타입.. == 값, === 객체 => boxing 효과에 의해서..
    println("기초 타입 객체 : ${no1==no2}, ${no1===no2}, ${no3==no4}, ${no3===no4}")

}