package com.clay.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        int n;
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("qaz"));
            String nstring=bufferedReader.readLine();
            while (nstring!=null){
                System.out.println(nstring);
                nstring=bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileInputstream();
//        fileReader();

    }

    private static void fileReader() {
        int n;
        File file1=new File("qaz");
        System.out.println(file1.exists());

        try {
            FileReader fileReader=new FileReader("qaz");
            n=fileReader.read();
            while (n != -1){
                System.out.print((char) n);
                n=fileReader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileInputstream() {
        int n;
        File file=new File("qwe");
        System.out.println( file.exists() );
        try {
            FileInputStream fileInputStream=new FileInputStream("qwe");
            n=fileInputStream.read();
            while ( n != -1)
            {
                System.out.print((char) n);
                n=fileInputStream.read();

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("檔案不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
