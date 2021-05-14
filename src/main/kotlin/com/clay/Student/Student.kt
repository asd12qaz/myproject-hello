package com.clay.Student

import java.util.*

fun main() {
//    outfun()//ctrl+alt+m 快速將程式外包
    val sd = studentdata11("clay", 70, 90)
    sd.print()
    println("bigvalue: ${sd.bigvalue()}")
//    var test:String?="qldkvmnir" //null用法測試
//    test=null
//    println(test?.substring(1))
}

class studentdata11(val name:String,val english:Int,val math:Int){

    fun print(){

        println(name+"\t"+english+"\t"+math+"\t"+average())
    }
    fun average():Int{
        var average =(english+math)/2
        return average;
    }
    fun bigvalue():Int{
        var bigvalue=if(english>math) english else math
        return bigvalue
    }
}
//private fun outfun() {  //外包程式
//    val scanner = Scanner(System.`in`)
//    println("please enter name:")
//    var name = scanner.next()
//    println("please enter english:")
//    var english = scanner.nextInt()
//    println("please enter math:")
//    var math = scanner.nextInt()
//    val sd = studentdata11(name, english, math)
//    sd.print()
//}
