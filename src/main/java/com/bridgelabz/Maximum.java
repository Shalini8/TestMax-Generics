package com.bridgelabz;

public class Maximum <T extends Comparable <T>>{
    T x,y,z;

    public Maximum() {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMax(){
        return Maximum.testMax(x,y,z);
    }
    public static <E extends Comparable> E testMax(E x, E y, E z) {
            if (x.compareTo(y) > 0) {
                if (x.compareTo(z) > 0) {
                    return x;
                }
            }
            if (y.compareTo(z) > 0) {
                return y;
            }
            return z;
        }
    }

