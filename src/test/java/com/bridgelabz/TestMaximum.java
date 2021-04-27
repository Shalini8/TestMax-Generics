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


}
