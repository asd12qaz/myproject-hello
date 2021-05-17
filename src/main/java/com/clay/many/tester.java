package com.clay.many;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class tester {
    public static void main(String[] args) {
//        arraylist();
//        fortest();
//        hashmap();
        Duration duration=Duration.ofMinutes(15);
    }

    private static void hashmap() {
        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("0050","台灣");
        hashMap.put("0052","日本");
        hashMap.put("0056","大陸");
        System.out.println(hashMap.get("0056"));
        for(String key:hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }
    }

    private static void arraylist() {
        ArrayList<Integer> array=new ArrayList();
        array.add(11);
        array.add(25);
        array.add(32);
        array.add(21);

        List<Integer> array1= Arrays.asList(23,15,65,25,16,100);

        for(int i: array1) {
            System.out.println(i);
        }
    }

    private static void fortest() {
        int[] int123= new int[5];

        int123[0]=25;
        int123[1]=52;
        int123[2]=33;
        int123[3]=55;
        int123[4]=100;

        for(int i :int123)
        {
            System.out.println(i);
        }
    }
}
