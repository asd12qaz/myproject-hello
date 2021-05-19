package com.clay.student;

public class GrantuateStuentDate extends StudentData{
    int thesis;
    static int pass;



    @Override
    public void printdata() {
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
        System.out.println(name+"\t"+english+"\t"+math+"\t"+average()+"\t"+thesis+"\t"
                +((average>=pass)? "pass":"failed")+"\tgrading="+grading);
    }

    public GrantuateStuentDate(String name, int english, int math, int thesis){
        super(name, english, math);
        this.thesis=thesis;


    }

}
