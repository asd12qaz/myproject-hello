package com.clay.Student

import java.util.*

fun main() {
//    outfun()//ctrl+alt+m 快速將程式外包
    studentdata11.pass=60
    grantuateStudentdatall.pass=70
    val sd = studentdata11("clay", 59, 92)
    sd.print()
    sd.standardKotlin()
    println("bigvalue: ${sd.bigvalue()}")
    val gsd=grantuateStudentdatall("blue",80,90,85)
    gsd.print()
    gsd.standardKotlin()
//    var test:String?="qldkvmnir" //null用法測試
//    test=null
//    println(test?.substring(1))
}
class grantuateStudentdatall( name: String, english: Int, math: Int,val thesis:Int):studentdata11(name, english, math){
    companion object{
        var pass:Int=50
    }

    override fun print() {
        print("$name\t$english\t$math\t${average()}\tgrading:${grading()}")//數值裡使用$可以放入變數，${}可以放入方法

    }

    override fun average(): Int {
        average =(english+math+thesis)/3
        return average;
    }

    override fun standardKotlin() {
        if(average> pass)
            println("\tpass")
        else
            println("\tfailed")
    }
}

open class studentdata11(val name:String,val english:Int,val math:Int){
    companion object{
        var pass:Int=60
    }
    var average: Int=0 ;
    open fun print(){
        print("$name\t$english\t$math\t${average()}\tgrading:${grading()}")//數值裡使用$可以放入變數，${}可以放入方法
    }
    open fun average():Int{
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

    open fun standardKotlin(){

        if(average>pass)
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
