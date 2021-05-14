package com.clay.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random=new Random();
        int cknumber= random.nextInt(100)+1;
        int number=0;
        while (cknumber!=number)
        {
            System.out.println("please enter 0-100 number:");
            Scanner scanner=new Scanner(System.in);
            number=scanner.nextInt();
            if(number>cknumber){
                System.out.println("number to big");
            }else if(number<cknumber){
                System.out.println("number to small");
            }else{
                System.out.println("nice");

            }

        }

    }

}
