package com.clay.Thread;

public class Tester {
    public static void main(String[] args) {
        for(int n=0;n<10;n++){
            System.out.println("testthread1\t"+n);
        }
        Thread thread =new Thread(){
            @Override
            public void run() {
                for(int n=0;n<10;n++){
                    System.out.println("testthread2\t"+n);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        ThreadTest threadTest=new ThreadTest();
        threadTest.start();

        System.out.println("TestThread over");






    }
}

class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("test3 \t"+i);

        }
    }
};