package com.example.kotlinlab.ch3

import com.example.kotlinlab.ch3.one.MyFile
import com.example.kotlinlab.ch3.one.data
import com.example.kotlinlab.ch3.one.printData

fun main(){
    val obj = MyFile()
    println("data : $data")
    printData()

//    KotlinFileKt.printData()//error....
}