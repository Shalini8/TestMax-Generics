package com.bridgelabz;
public class Maximum <E extends Comparable> {

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

