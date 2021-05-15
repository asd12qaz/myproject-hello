package com.clay.guess

import java.util.*
import kotlin.random.Random

fun main() {
    var number=5
    var cknumber= Random.nextInt(10)+1
    var rsnumber=0
    var scanner=Scanner(System.`in`)

    for (i in 1..5){
        print("please enater 第"+number+"次 number:")
        number--
        rsnumber=scanner.nextInt();
        if(rsnumber>cknumber){
            println("the number is too big")
        }else if(rsnumber<cknumber){
            println("the number is too small")
        }else {
            println("bingo")
            break}
    }
   println("over")

}