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
    public void checkMaxAtFirstPosition() {
        Maximum maximum = new Maximum();
        int valueToCheck = maximum.testMax(5,3,4);
        Assert.assertEquals(5, valueToCheck);
    }
    @Test
    public void checkMaxAtSecondPosition() {
        Maximum maximum = new Maximum();
        int valueToCheck = maximum.testMax(5,8,4);
        Assert.assertEquals(8, valueToCheck);
    }
    @Test
    public void checkMaxAtThirdPosition() {
        Maximum maximum = new Maximum();
        int valueToCheck = maximum.testMax(5,3,8);
        Assert.assertEquals(8, valueToCheck);
    }
    @Test
    public void checkMax_Of_Float_AtFirstPosition() {
        Maximum maximum = new Maximum();
        float valueToCheck = maximum.testMax(5.0f,3.0f,4.0f);
        Assert.assertEquals(5.0f, valueToCheck,0.0);
    }

    @Test
    public void checkMax_Of_Float_AtSecondPosition() {
        Maximum maximum = new Maximum();
        float valueToCheck = maximum.testMax(5.0f,8.0f,4.0f);
        Assert.assertEquals(8.0, valueToCheck,0.0);
    }

    @Test
    public void checkMax_Of_Float_AtThirdPosition() {
        Maximum maximum = new Maximum();
        float valueToCheck = maximum.testMax(5.0f,3.0f,8.0f);
        Assert.assertEquals(8.0, valueToCheck,0.0);
    }
    @Test
    public void checkMax_Of_String_AtFirstPosition() {
        String valueToCheck =  maximum.testMax("Peach","Banana","Apple");
        Assert.assertEquals("Peach",valueToCheck);
    }
    @Test
    public void checkMax_Of_String_AtSecondPosition() {
        String valueToCheck =  maximum.testMax("Banana","Peach","Apple");
        Assert.assertEquals("Peach",valueToCheck);
    } @Test
    public void checkMax_Of_String_AtThirdPosition() {
        String valueToCheck =  maximum.testMax("Apple","Banana","Peach");
        Assert.assertEquals("Peach",valueToCheck);
    }

    // @Method checks for an Maximum Of a Integer value
    @Test
    public void checkMax_Of_Integer() {
        int valueToCheck =  Maximum.testMax(5,8,4,1,0,5);
        Assert.assertEquals(8, valueToCheck);
    }
    // @Method checks for an Maximum Of a Float value
    @Test
    public void checkMax_Of_Float() {
        float valueToCheck =  Maximum.testMax(5.0f,3.0f,4.0f,1.2f);
        Assert.assertEquals(5.0f, valueToCheck,0.0);
    }
    // @Method checks for an Maximum Of a String value

    @Test
    public void checkMax_Of_String() {
        String valueToCheck =  Maximum.testMax("Apple","Banana","Peach","Pear");
        Assert.assertEquals("Pear",valueToCheck);
    }
}
