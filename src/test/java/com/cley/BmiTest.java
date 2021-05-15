package com.cley;

import com.clay.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BmiTest {
    @Test
    public void personTest(){
        Person person=new Person(65f,1.6f);
        Assertions.assertEquals(65f/(1.6f*1.6f),person.BMI());
    }
}
