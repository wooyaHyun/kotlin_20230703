package com.example.kotlinlab.ch5

fun main() {
    fun arrayTest() {
        //배열 변수 선언하면서. 초기 값 대입...
        val array1 = arrayOf(10, 20, "hello")//선언할때 타입을 [] 로 표현하지는 않는다..
        array1[0]=30
        array1[1]="world"//값을 index 로 이용할 때는 []
        //클래스임으로.. 함수, 프로퍼티 이용 가능..
        println("array : ${array1.size}, ${array1[0]}, ${array1.get(1)}")

        //배열 데이터 타입 명시...
        arrayOf<Int>(10, 20)
        //기초 타입의 데이터라면..
        intArrayOf(10, 20)//권장사항은 아니다.. 자바 호환성에만 사용하라.. 자바에 int[] 로 선언된 배열을 받기 위한 용도로만

        //사이즈 지정.
        Array(3, {i -> i*10})//두번째 매개변수.. 람다함수.. 호출되고.. 람다함수 리턴값이 초기 배열 데이터..
        //람다함수내에서는 return 예약어 사용 못한다..
        IntArray(3, { 0 })

        //사이즈 지정.. 초기 값 모두 null
        arrayOfNulls<Int>(2)

        //기초 타입을 위한 배열 클래스에 사이즈만 주면.. Int -> 0, Boolean -> false
        IntArray(2)

        //2차원 배열....................
        //자바에서는 int[][]
        val array2 = Array<Array<Int>>(2, {Array<Int>(3, { 0 })})
        array2[0][0]
    }

    val list1 = listOf<Int>(10, 20)//immutable...
    list1.get(0)//값 획득..
//    list1.add()//error...

    val list2 = mutableListOf<Int>(10, 20)
    list2.get(0)
    list2.set(0, 20)
    list2.add(30)

    //map............................
    val map1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world"))//immutable
    map1.get("one")
    val map2 = mapOf<String, String>("one" to "hello", "two" to "world")

    //iterable...............
    val iterator1 = list1.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

    val iterator2 = map1.iterator()
    while (iterator2.hasNext()){
        val entry = iterator2.next()//전달되는 것은 값이 아니라.. Entry 객체...
        println("${entry.key} - ${entry.value}")
    }

}