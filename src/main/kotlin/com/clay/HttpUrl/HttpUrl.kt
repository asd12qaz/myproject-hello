package com.clay.HttpUrl

import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
//    var url=URL("https://datacenter.taichung.gov.tw/swagger/OpenData/edc5ff6b-c020-4f90-80d4-f8d710e59d05") //將物件存放url
//     println(url.readText()) //直接取得資料，並顯示出來
//    var stringBuffer=StringBuffer(url.readText()) //將資料存放至stringbuffer中
//    println(stringBuffer.toString())

     var url=URL("https://datacenter.taichung.gov.tw/swagger/OpenData/edc5ff6b-c020-4f90-80d4-f8d710e59d05")
     val connect=url.openConnection() as HttpURLConnection
     var inputStream=connect.inputStream
     var inputStreamReader=InputStreamReader(inputStream)
     var n=inputStreamReader.read()
      while (n != -1){
        print(n.toChar())
        n=inputStreamReader.read()
    }

}