package com.clay.student;

import java.util.Scanner;//雖然是內建類別，但不屬於java.lang的都需要ipport使用

public class Student {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter name:");
        String name=scanner.next();
        System.out.println("please enter english:");
        int english=scanner.nextInt();
        System.out.println("please enter math:");
        int math=scanner.nextInt();
        StudentData sd =new StudentData(name,english,math);
        sd.printdata();


    }
}
