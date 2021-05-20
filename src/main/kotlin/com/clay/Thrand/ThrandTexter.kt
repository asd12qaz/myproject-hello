package com.clay.Thrand

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
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