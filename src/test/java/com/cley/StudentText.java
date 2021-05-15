package com.cley;

import com.clay.student.Student;
import com.clay.student.StudentData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentText {
    @Test
    public void averAgeTest(){
        StudentData studentData=new StudentData("clay",99,90);
        Assertions.assertEquals((99+90)/2,studentData.average());
    }
    @Test
    public void bigvalueTest(){
        StudentData studentData=new StudentData("clay",99,90);
        Assertions.assertEquals(99,studentData.bigvalue());
    }
}
