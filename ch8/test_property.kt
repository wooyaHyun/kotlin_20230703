package com.example.kotlinlab.ch8

class User {
    var id: Int = 0
        set(value){
            if(value < 0)
                field = 0
            else
                field = value
        }

    var name: String? = null
        get(){
            return field?.uppercase()
        }

    //backing field(accessor 내에 선언된 field 예약어.. 이 예약어에 의해서.. 자바 변형시.. private 변수가 만들어진다.)
    //custom accessor 를 만들면서 field 안써도 된다.. 그러면 변수가 만들어 지지 않는다.. 변수 없는데 무슨 값을???
//    val data2: String = "aaa"//error
    val data2: String
        get() = "kim"

    //backing field 가 없다면 초기값 못준다..
//    var data3: String = "aaa"
//        get() = "kim"
//        set(value){
//            data3 = value
//        }
}

lateinit var data1: String

class MyClass {
    val data1: Int
    var data2: String
    init {
        data1 = 10
        data2 = "aaa"
    }
    lateinit var data3: String
    val data4: Int by lazy {
        //프로퍼티를 초기화 하기 위해서 로직이 실행되어야 하고.. 그 로직 실행결과 값으로 초기화 되는데..
        //그 로직 실행이 실제 이 프로퍼티가 이용될때 하고 싶다면..
        println("lazy......")
        10
    }
}

fun main() {
    var obj = User()
    obj.id = 20
    obj.name = "kim"

    println("id: ${obj.id}, name: ${obj.name}")

    val obj2 = MyClass()
    println("step 1..... ")
    val a = obj2.data4
    println("step 2....")
}