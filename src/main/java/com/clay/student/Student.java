package com.clay.student;

//import java.util.Scanner;//雖然是內建類別，但不屬於java.lang的都需要ipport使用

public class Student {
    public static void main(String[] args) {

//        outfun();//ctrl+alt+m 快速將程式打包放置外面
        StudentData sd =new StudentData("clay",70,90);
        sd.printdata();
        System.out.println("big value:"+sd.bigvalue());

//        String test="qplslmvax"; //字串處理
//        System.out.println(test.substring(1));
    }

//    private static void outfun() {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter name:");
//        String name=scanner.next();
//        System.out.println("please enter english:");
//        int english=scanner.nextInt();
//        System.out.println("please enter math:");
//        int math=scanner.nextInt();
//        StudentData sd =new StudentData(name,english,math);
//        sd.printdata();
//    }
}
