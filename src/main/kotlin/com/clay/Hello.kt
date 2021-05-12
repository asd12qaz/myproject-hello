package com.clay

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.BMMimeMultipart

fun main() {
//    println("hello kotlin")
    val h=Human( weight = 65f,height = 1.6f)
    h.hello()
    println(h.bmi())
    /*val val1=55.3;
    var var1 :Int;
    var1=55;*/

}

class Human(var weight:Float,var height:Float,var name:String=""){
    init {
        println("ss")
    }

    fun hello(){
        println("hello world")
    }
    fun bmi():Float{

        val bmi=weight/(height*height)
        return bmi
    }
}