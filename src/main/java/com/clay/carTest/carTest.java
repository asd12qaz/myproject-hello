package com.clay.carTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Random;

//停車場練習 carclass為相關類別(汽車)

public class carTest {
    public static void main(String[] args) {
//        mancar();
        HashMap<String,carclass> carinfo=new HashMap<>();
        LocalDateTime localnow = LocalDateTime.now();
        LocalDateTime localleave = LocalDateTime.of(2021, 5, 18, 3, 0);
        //第一台車進場資訊
        carclass carclass = new carclass("A-00005", localnow);
        carinfo.put("A-00005",carclass);
        //第二台車進長資訊
        carclass=new carclass("B-00009", localnow.plusHours(1));
        carinfo.put("B-00009",carclass);
        //第二台車離開資訊
        carclass=carinfo.get("B-00009");
        carclass.Leave(localleave);
//        System.out.println(carinfo.size());
        //第一台車離開資訊
        carclass=carinfo.get("A-00005");
        carclass.Leave(localleave.plusMinutes(24));

//        System.out.println(carinfo.size());
        for (String info:carinfo.keySet()){
            carclass=carinfo.get(info);
            System.out.println(carclass.ID+"\t"+carclass.Localnow);
        }


    }

    private static void mancar() {
//        Random random = new Random();
//        int ID = random.nextInt(10000) + 10000;
//        LocalDateTime localnow = LocalDateTime.now();
//        LocalDateTime localleave = LocalDateTime.of(2021, 5, 17, 16, 0);
//        carclass carclass = new carclass(ID, localnow);
//        carclass.Leave(localleave);
    }
}
