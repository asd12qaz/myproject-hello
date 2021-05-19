package com.clay.many

import com.sun.xml.internal.bind.v2.model.core.ID
import java.time.Duration
import java.time.LocalDateTime

//停車場練習 hashmap
fun main() {
//    muarray()
    var hashMap=HashMap<String,Car?>()
    val enter = LocalDateTime.now()
    val leave = LocalDateTime.of(2021,5,18,16,0,0)
    //第一台車進場
    var car:Car?=Car("AA-0003",enter)
    hashMap.put("AA-0003",car)
    //第二台車進場
    car=Car("AB-0085",enter)
    hashMap.put("AB-0085",car)
    //第三台車進場
    car=Car("AC-1085",enter)
    hashMap.put("AC-1085",car)
    car?.leave(leave)

    println(hashMap.size)






}

class Car(val ID:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null
    var time=0;
    var cost=0;
    var timecost=0;
    fun leave(leave:LocalDateTime){
        if(enter.isBefore(leave)){
            this.leave=leave
            time()
            cost()
            print()
        }else{
            println("系統錯誤 聯繫系統管理員 造成不便請見諒")
        }
    }

    fun time(){
        time=Duration.between(enter,leave).toMinutes().toInt()
        timecost=Math.ceil(time/60.0).toInt()

    }
    fun cost(){
        if(timecost>5){
            cost=((timecost*60)*0.9).toInt()
        }else{
            cost=timecost*60
        }


    }
    fun print(){
        println("車牌:$ID      \t總停車時間:$time 分鐘")
        println("系統計算時間:$timecost 小時\t費用:$cost 元")
    }

}

private fun muarray() {
    val array = mutableListOf(5, 3, 2)
    array.add(52)
    for (i in array) {
        println(i)
    }
}