package com.clay;

public class Person {
       float weigh;
       float height;
       public  Person(float weigh,float height){

       }
       public float BMI(){
              float bmi=weigh/ (height*height);
              return bmi;
       }
       public void hello(){
              System.out.println("hello world");
       };
}

