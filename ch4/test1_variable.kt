package com.example.kotlinlab.ch4

//top level, class member 변수..  default 초기화 되지 않는다..
//모든 타입은 객체이다.. default 초기화 하려면 객체임으로 null 이어야 하는데.. kotlin 은 null safety 를 지원한다..
val data1: Int = 10
var data2: Int = 10

class MyClass {
    val data3: Int =10
    var data4: Int = 10

    fun some() {
        //local variable 에 한해서만.. 선언과 동시에 초기화 하지 않아도 된다..
        val data5: Int
        var data6: Int

        data5 = 10
        data6 = 10
        //선언과 동시에 초기화 하지 않아도 되지만.. 이용되기 전에는 초기화 되어 있어야 한다..
        val result = data5 + data6
    }

    val data7: Int? = null//type 을 명시할 때 nullable, non-null 구분해서 사용해야 한다..

    val valData: Int//val 은 값 변경이 안된다.. 그렇다고 상수 변수는 아니다..
        get() {
            if(myBool)
                return 100
            else
                return 0
        }
    var myBool = false
}

fun main() {
    val obj = MyClass()

//    obj.valData++//error...
    println("valData : ${obj.valData}")
    obj.myBool = true
    var a = println("valData : ${obj.valData}")
    println(a)

}