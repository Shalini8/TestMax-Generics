package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximum {
    Maximum maximum;

    @Before
    public void setUp() throws Exception {
        maximum = new Maximum();
    }

    @Test
    public void checkMax_At_FirstPosition() {
        int valueToCheck =  Maximum.testMax(5,3,4);
        Assert.assertEquals(5, valueToCheck);
    }

    @Test
    public void checkMax_At_SecondPosition() {
        int valueToCheck =  Maximum.testMax(5,8,4);
        Assert.assertEquals(8, valueToCheck);
    }

    @Test
    public void checkMax_At_ThirdPosition() {
        int valueToCheck =  Maximum.testMax(5,3,8);
        Assert.assertEquals(8, valueToCheck);
    }
    @Test
    public void checkMax_Of_Float_AtFirstPosition() {
        float valueToCheck =  Maximum.testMax(5.0f,3.0f,4.0f);
        Assert.assertEquals(5.0f, valueToCheck,0.0);
    }

    @Test
    public void checkMax_Of_Float_AtSecondPosition() {
        float valueToCheck =  Maximum.testMax(5.0f,8.0f,4.0f);
        Assert.assertEquals(8.0, valueToCheck,0.0);
    }

    @Test
    public void checkMax_Of_Float_AtThirdPosition() {
        float valueToCheck =  Maximum.testMax(5.0f,3.0f,8.0f);
        Assert.assertEquals(8.0, valueToCheck,0.0);
    }
    @Test
    public void checkMax_Of_String_AtFirstPosition() {
        String valueToCheck =  Maximum.testMax("Peach","Banana","Apple");
        Assert.assertEquals("Peach",valueToCheck);
    }
    @Test
    public void checkMax_Of_String_AtSecondPosition() {
        String valueToCheck =  Maximum.testMax("Banana","Peach","Apple");
        Assert.assertEquals("Peach",valueToCheck);
    } @Test
    public void checkMax_Of_String_AtThirdPosition() {
        String valueToCheck =  Maximum.testMax("Apple","Banana","Peach");
        Assert.assertEquals("Peach",valueToCheck);
    }
}
