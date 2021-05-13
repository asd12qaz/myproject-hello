package com.clay.Student

fun main() {
    val sd=studentdata11("clay",60,90)
    sd.print()
}

class studentdata11(val name:String,val english:Int,val math:Int){

    fun print(){

        println(name+"\t"+english+"\t"+math)
    }
    fun average():Int{
        var average =(english+math)/2
        return average;
    }


}