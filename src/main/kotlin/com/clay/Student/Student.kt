package com.clay.Student

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("please enter name:")
    var name=scanner.next()
    println("please enter english:")
    var english=scanner.nextInt()
    println("please enter math:")
    var math=scanner.nextInt()
    val sd=studentdata11(name,english, math)
    sd.print()
}

class studentdata11(val name:String,val english:Int,val math:Int){

    fun print(){

        println(name+"\t"+english+"\t"+math+"\t"+average())
    }
    fun average():Int{
        var average =(english+math)/2
        return average;
    }


}