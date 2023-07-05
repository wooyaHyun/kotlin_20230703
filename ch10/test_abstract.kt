package com.example.kotlinlab.ch10

abstract class Super {
    //property 를 추상형으로 만드는 것은.. 하위에서 오버라이드 받아서 초기화 하라..
    //이런 프로퍼티는 있다.. 초기값은 하위가 결정하라..
    //자바에서는 추상 변수 제공하지 않는다..
    //자바로 변형시에.. getter, setter 함수가 추상으로 선언된다..
    abstract val data1: String

    open fun some1(){

    }
    abstract fun some2()

    open fun some3(){

    }
}

interface Interface1 {
    //kotlin 의 인터페이스내에 선언된 프로퍼티는 기본이 추상형..
    val data1: String

    //정상 프로퍼티 선언은 되는가???
    //초기값 = 로 대입할 수 없다..
//    val data2: Int = 10
    //정상 프로퍼티로 만들려면 get(), set() 선언해야..
    //custom accessor 내에 field 선언할 수 없다..
    //정상 함수로만 들어가게... 초기값 못주고.. field 못쓰고..
//    val data2: Int
//        get() = field
    val data2: Int
        get() = 10
    
    var data3: Int
        get() = 10
        set(value) {
            println(".......")
        }

    fun some1(){}
    fun some2()
    fun some3()

}

interface Interface2

class Sub: Interface1, Super(), Interface2 {
    override val data1: String = "kim"

    //모두 추상형으로 선언된 함수..
    //override 만 받으면 해결..
    override fun some2() {

    }
    //하나가 추상형.. 하나가 정상...
    //추상형임으로 override 받아야 하고..
    override fun some3() {
        //정상 함수 접근은.. super 로..
        super.some3()
    }
    //정상함수가 여러개인경우..
    override fun some1() {
        super<Interface1>.some1()
        super<Super>.some1()
    }
}