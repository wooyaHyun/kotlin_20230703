package com.example.kotlinlab.ch11

enum class Direction {
    NORTH, SOUTH
}

//enum 상수에 데이터 심기...
//enum 클래스 생성자에 먼저 추가할 데이터 선언...
enum class Direction2(val no: Int, val email: String) {
    NORTH(10, "a@a.com"), SOUTH(20, "b@b.com")
}

//enum 상수에 함수 심기..
//상수.. 익명 클래스.. 그 함수를 이용하려면 상위에 먼저 선언..
enum class Direction3 {
    NORTH {
        //상위와 관련없는 변수 함수...? 가능하다..
        //단.. 이 클래스는 이름이 없음으로 상위 타입으로 밖에 이용이 안된다..
        //이곳에 추가한 변수, 함수는.. 이 클래스내부에서만.. 외부에서는 이용 불가..
        val data1 = 0
        fun some1() {}

        override val data2: Int = 10
        override fun some2() {

        }
    },
    SOUTH {
        override val data2: Int
            get() = 20

        override fun some2() {

        }
    }
    ;//enum 클래스 내에서.. 상수와 클래스 바디를 구분하기 위해서 ; 이 이용..
    abstract val data2: Int
    abstract fun some2()
    //enum 클래스내에 정상적인 변수, 함수 선언가능한가...? 가능하다..
    //하위 enum 상수의 공통..
    val data3 = 30
    fun some3(){}
}

//sealed 클래스의 생성자에는 자동으로  private 추가된다..
//동일 파일에 한해서만.. 하위 클래스 정의할 수 있게..
sealed class Super private constructor(val x: Int, val y: Int){
    class Sub1(x: Int, y: Int, a: Int): Super(x, y)
    class Sub2(x: Int, y: Int): Super(x, y)
}



//abstract class Super2 private constructor(){}
//class Sub3: Super2(){}
//class Sub4: Super2(){}

fun main() {
    val data1: Direction = Direction.NORTH
    println("${data1.name}, ${data1.ordinal}")

    val data2: Direction2= Direction2.NORTH
    println("${data2.no}, ${data2.email}")

    val data3: Direction3 = Direction3.NORTH
    data3.data2
    data3.some2()

//    val data4: Super = Sub2(10, 20)
}