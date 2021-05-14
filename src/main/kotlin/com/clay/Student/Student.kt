package com.clay.Student

import java.util.*

fun main() {
//    outfun()//ctrl+alt+m 快速將程式外包

    val sd = studentdata11("clay", 59, 92)
    sd.print()
    sd.standardKotlin()
    println("bigvalue: ${sd.bigvalue()}")
//    var test:String?="qldkvmnir" //null用法測試
//    test=null
//    println(test?.substring(1))
}

class studentdata11(val name:String,val english:Int,val math:Int){
    var average: Int=0 ;

    fun print(){
        print("$name\t$english\t$math\t${average()}\tgrading:${grading()}")//數值裡使用$可以放入變數，${}可以放入方法
    }
    fun average():Int{
         average =(english+math)/2
        return average;
    }
    fun bigvalue()=if(english>math) english else math


    fun grading()=when(average()){
            in 90..100 ->'A'
            in 80..89  ->'B'
            in 70..79  ->'C'
            in 60..69  ->'D'
            else       ->'F'
    }

    fun standardKotlin(){
        if(average>60)
            println("\tpass")
        else
            println("\tfailed")
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
