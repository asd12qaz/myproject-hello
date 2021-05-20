package com.clay.Thread

import kotlin.concurrent.thread

fun main() {
    var n =1;
    for (n in 1..10){
        println("ThrandText1 \t$n")
    }
    Thread({
        for (n in 1..10){
            println("ThrandText2 \t$n")
        }
    }).start()
    thread {
        for (n in 1..10){
            println("ThrandText3 \t$n")
        }
    }

    println("thrand over")
}