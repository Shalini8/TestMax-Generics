package com.bridgelabz;

public class Maximum <T extends Comparable <T>> {
    T x, y, z;

    public Maximum() {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public static <T extends Comparable<T>> T testMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}



