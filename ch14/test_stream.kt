package com.example.kotlinlab.ch14

import com.google.gson.Gson
import java.io.File

data class Data(val id: Int, val name: String, val addr: String, val age: String)

fun main() {
    //file... java.io api 이용..
    val file = File("c://test.txt")
    val inputStream = file.inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }

    //parsing..
    val gson = Gson()
    //읽어들인 문자열을(inputString) 파싱해서.. Array<Data> 타입으로 반환한다..
    //클래스 타입 정보.. reflection 정보를 준거다..
    //코틀린의 클래스  reflection 은 KClass<*> 이며.. 이곳에 대입할 때는 A::class 로 주면 되는데..
    //자바에서의 클래스 reflection 은 Class<*> 이며. 이곳에 대입할 때는 A::class.java 로 주면 된다..
    val list: List<Data> = gson.fromJson(inputString, Array<Data>::class.java).toList()

    list.filter { it.addr.equals("seoul") }
        .groupBy { it.age }
        .forEach {
            println("${it.key} - ${it.value.count()}")
            it.value.forEach {
                println("${it.name} - ${it.addr} -${it.age}")
            }
        }
}