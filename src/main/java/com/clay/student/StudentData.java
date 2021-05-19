package com.clay.student;

public class StudentData {
    String name;
    int english;
    int math;
    int average;
    static int pass=60;

    public StudentData(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void printdata(){

            char grading;

            switch (average()/10) {
                case 9:
                    grading ='A';
                    break;
             case 8:
                    grading ='B';
                    break;
             case 7:
                    grading ='C';
                    break;
             case 6:
                    grading='D';
                    break;
             default:
                    grading='F';
                    break;
        }
        System.out.println(name+"\t"+english+"\t"+math+"\t"+average()+"\t"
                +((average>=pass)? "pass":"failed")+"\tgrading="+grading);
    }
    public int average(){
         average = (english+math)/2;

        return average;
    }
    public int bigvalue(){

        return (math>english) ?  math:english;
    }

}
