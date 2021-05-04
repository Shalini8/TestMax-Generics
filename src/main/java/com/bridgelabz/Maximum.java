package com.bridgelabz;

public class Maximum <T extends Comparable <T>> {
    T x, y, z;

    public static <T extends Comparable<T>> T testMax(T ...elements) {
        T max = elements[0];
        for (T element : elements){
            if(element.compareTo(max) > 0) {
                max = element;
            }
        }
        printMax(max);
        return max;
    }
    private static <T> void printMax(T max)
    {
        System.out.println("Maximum is : " +max );
    }
}



