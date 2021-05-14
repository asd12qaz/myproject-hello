package com.clay.guess

import java.util.*

fun main() {
    var cknumber=Random().nextInt(100)+1
    var number:Int=0;
    while (cknumber!=number){
        print("please enter 0-100 number:")
        val scanner=Scanner(System.`in`)
        number=scanner.nextInt()
        if(number>cknumber){
            println("number is too big")
        }else if(number<cknumber){
            println("number is too small")
        }else{
            println("bingo")
        }

    }




}