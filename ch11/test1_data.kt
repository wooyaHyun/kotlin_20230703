package com.example.kotlinlab.ch11

class User(val no: Int, val name: String)

data class UserData(val no: Int, val name: String){
    var email: String? = null
    constructor(no: Int, name: String, email: String):this(no, name){
        this.email = email
    }
}

fun main() {
    val user1 = User(1, "kkang")
    val user2 = User(1, "kkang")

    val user3 = UserData(1, "kkang", "a@a.com")
    val user4 = UserData(1, "kkang", "b@b.com")

    //false, false, true
    //data class 객체비교만 값 비교, 주생성자의 멤버만 값 비교..
    println("${user1.equals(user2)}, ${user1.equals(user3)}, ${user3.equals(user4)}")

    //data 클래스 객체의 비교는 값 비교이다.. equals 함수가 오버라이드 되어 있어서..
    //data 클래스의 객체 비교를 객체가 동일 객체인지를 비교하려면..
    //false, false, true, false
    //kotlin 의 비교연산자는 == , ===
    //자바는 == 만 있다..
    //kotlin == => equals 로
    //=== => ==
    println("${user1 == user2}, ${user1 === user2}, ${user3 == user4}, ${user3 === user4}")



    //toString..........................
    //com.example.kotlinlab.ch11.User@17c68925, UserData(no=1, name=kkang)
    println("${user1.toString()}, ${user3.toString()}")


    //destructing assignment
    //객체 분해 할당..
    val no1 = user3.component1()
    val name1 = user3.component2()

    //한꺼번에  data 클래스 객체의 데이터를 여러개 뽑을 경우..
    val (no2, name2) = user3//변수명이 아니라 순서로 뽑힌다..
    println("$no1, $name1, $no2, $name2")//1, kkang, 1, kkang

    //순서로 매핑된다.. 2, 4, 7번째 데이터만 뽑아야 된다면..
    //순서는 맞추어야 한다.. 뽑지 않아도 되는 데이터는 _ 로 처리..
    val (_, name3) = user3

    //destructing assignment 기법은 data 클래스 이외에 List 도 가능하기는 하다..
    val list = listOf(1, 2, 3, 4)

    val (a1, a2) = list
    println("$a1, $a2")//1, 2

    val (b1, b2) = list.drop(1)//앞에 1개 버리고..
    val (_, c1, _, c2) = list

    val d1 = list.component1()

    //함수를 하나 선언할 건데.. 이 함수의 리턴 값이 여러개였으면 좋겠다..
    //이를 흔히 tuple 기법이라고 하는데 코틀린은 아직 제공하지 않는다..
//    fun some(): (Int, Int, Int){
//        return (10, 20, 30)
//    }
//    val (e1, e2, e3) = some()

    data class Datas(var data1: Int, var data2: Int, var data3: Int)
    fun some(): Datas {
        return Datas(10, 20, 30)
    }
    val (e1, e2, e3) = some()


    fun some2(): Array<Int>{
        return arrayOf(10, 20, 30)
    }
    val (f1, f2, f3) = some2()

}