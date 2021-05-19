package com.clay.io;

import java.io.*;

public class writerTester {
    public static void main(String[] args) {
        File file=new File("qzz");
        System.out.println( file.exists());

        ouyputstrem(file);
//        try {
//            FileWriter fileWriter=new FileWriter(file);
//            fileWriter.write("ddsdvvd你好d");
//            fileWriter.flush();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    private static void ouyputstrem(File file) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            fileOutputStream.write("dd你媽好dd".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
