package com.bridgelabz;
public class Maximum {
    public Integer testMax(Integer x, Integer y, Integer z) {
    Integer max = x;
    if (y.compareTo(max) > 0) {
        max = y;
        }if (z.compareTo(max) > 0) {
        max = z;
        }
    return max;
    }
    public Float testMax(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public String testMax(String x, String y, String z){
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
