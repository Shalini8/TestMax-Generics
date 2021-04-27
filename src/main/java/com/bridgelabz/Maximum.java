package com.bridgelabz;

public class Maximum <T extends Comparable <T>> {
    T x, y, z;

//    public Maximum() {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }


    public static <T extends Comparable<T>> T testMax(T ...elements) {
        T max = elements[0];
        for (T element : elements){
            if(element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}



