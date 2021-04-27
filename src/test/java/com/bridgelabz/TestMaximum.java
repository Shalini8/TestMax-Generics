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
    public void checkMax_Of_Integer() {
        int valueToCheck =  Maximum.testMax(5,8,4,1,0,5);
        Assert.assertEquals(8, valueToCheck);
    }
    @Test
    public void checkMax_Of_Float() {
        float valueToCheck =  Maximum.testMax(5.0f,3.0f,4.0f,1.2f);
        Assert.assertEquals(5.0f, valueToCheck,0.0);
    }

    @Test
    public void checkMax_Of_String() {
        String valueToCheck =  Maximum.testMax("Apple","Banana","Peach","Pear");
        Assert.assertEquals("Pear",valueToCheck);
    }
}
