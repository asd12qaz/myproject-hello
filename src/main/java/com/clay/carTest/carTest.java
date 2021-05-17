package com.clay.carTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class carTest {
    public static void main(String[] args) {
        Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        int ID = random.nextInt(10000) + 10000;
        LocalDateTime localnow = LocalDateTime.now();
        LocalDateTime localleave = LocalDateTime.of(2021, 5, 17, 16, 0);
        carclass carclass = new carclass(ID, localnow);
        carclass.Leave(localleave);
    }
}
