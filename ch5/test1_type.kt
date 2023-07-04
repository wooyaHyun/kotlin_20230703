package com.example.kotlinlab.ch5

//new, static, switch - case, extends, implements, instanceof

//Any - 최상위 클래스..
fun testAny(arg: Any){
    //kotlin 에서는 자바의 switch-case 예약어가 없다..
    //when 으로 대체한다.. switch-case 보다 능력이 더 많다..
    //정수값 이외에 다양한 타입의 값으로 조건 가능..
    //type 으로 조건..
    //범위로 조건...
    when(arg){
        1 -> println("arg is 1")
        10, 20 -> println("arg is 10 or 20")
        30 -> {
            var result = arg as Int * 10//명시적 캐스팅..
            println("arg is 30, result : $result")
        }
        "hello" -> println("arg is hello")
        is Int -> println("arg type is Int")//type 으로 조건...
        is String -> println("arg type is String")
        else -> println("unKnown data")
    }
}
fun main() {
    testAny(30)
    testAny("hello")

    //casting....
    val data1 = 10
    //객체임으로.. 자동 캐스팅이 되지 않는다..
    //as 에 의해 명시적 캐스팅.. 컴파일 에러는 사라지지만..  runtime error...
//    val data2: Double = data1 as Double//error
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    val data4: String = data1.toString()
    val data5: Int = data4.toInt()

    //nullable - non-null 도 타입이다..
    //캐스팅 관점에서..  nullable 이 상위다..
    val data6: Any = 10
    var data7: Any? = data6
    //nullable -> non-null 은 명시적 캐스팅...
    //nullable 이다.. null 대입 가능성이 있다.. as 캐스팅 시점에 null 이면?? NPE 발생...
    //null 가능성 있는 경우.. 캐스팅 할때.. as?
    //as? 도 캐스팅 연산자...왼쪽.. 이 null 이 아니면 정상 캐스팅.. null이면 캐스팅 하지 않고..전체.. null
    data7 = null
    val data8: Any = data7 as? Any ?: 0//?: - null safety 연산자.. 왼쪽이 null 인경우에..
}