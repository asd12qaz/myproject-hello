package com.clay.student;

public class StudentData {
    String name;
    int english;
    int math;

    public StudentData(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void printdata(){

        System.out.println(name+"\t"+english+"\t"+math+"\t"+average());
    }
    public float average(){
        float average = (english+math)/2;

        return average;
    }
    public int bigvalue(){

        return (math>english) ?  math:english;
    }
}
