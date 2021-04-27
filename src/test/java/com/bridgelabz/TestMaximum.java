package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
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



}
