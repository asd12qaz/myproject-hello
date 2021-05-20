package com.clay.io;

import java.io.*;

public class newfileTest {
    public static void main(String[] args) {
        File file=new File("qazz");

        try {
            FileReader fileReader=new FileReader("qaz");
            int n=fileReader.read();
            while (n!=-1)
            {
                System.out.print((char)n);
                n=fileReader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("file input over");

    }
}
