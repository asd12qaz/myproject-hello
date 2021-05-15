package com.clay

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class bmiText {

    @Test
    fun bmiText(){
        val human=Human(65f,1.6f)
        Assertions.assertEquals(65f/(1.6f*1.6f),human.bmi())
    }


}