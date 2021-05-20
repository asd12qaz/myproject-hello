package com.clay.HttpUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://datacenter.taichung.gov.tw/swagger/OpenData/edc5ff6b-c020-4f90-80d4-f8d710e59d05"); //取得網站位址
            HttpURLConnection httpconn=(HttpURLConnection)url.openConnection(); //建立連結
            InputStream inputStream=httpconn.getInputStream(); //取得物件串流
//            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
//            String read= bufferedReader.readLine();
//            while (read != null){
//                System.out.print(read);
//                read=bufferedReader.readLine();
//            }
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream); //建立讀取類別

            int n=inputStreamReader.read(); //透過讀取列別的方式，搭配迴圈讀取資料
            while (n != -1){
                System.out.print((char) n);
                n=inputStreamReader.read();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
