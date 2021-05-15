package com.clay.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Random random=new Random();
        int number=5;
        int cknumber=random.nextInt(20)+1;
        System.out.println(cknumber);
        int rsnumber=0;
        Scanner scanner=new Scanner(System.in);
        for(number=5;number>0;number--){
            System.out.print("Please enter 第"+number+"次number:");
            rsnumber=scanner.nextInt();
            if(rsnumber>cknumber){
                System.out.println("number is too big");
            }else if (rsnumber<cknumber){
                System.out.println("number is too small");
            }else break;
        }
        if(rsnumber==cknumber){
            System.out.println("bingo");
        }else {
            System.out.println("fight");
        }


    }
}

//File / Setting / Build, Execution, Deployment / Build Tools / Gradle
//將 Build and run using 和 Run tests using 都改成 IntelliJ IDEA--解決中文編碼問題