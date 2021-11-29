package edu.sdsu.cs160l.complexity;

import java.util.Arrays;
import java.util.Random;

public class DataProvider {

    private static final int SIZE = 10000;
    private static final Integer[] a = new Integer[SIZE];
    private static final Random r = new Random();

    static {
        for (int i = 0; i < SIZE; i++) {
            a[i] = r.nextInt();
        }
    }

    // return copy of the array since we are manipulating the original array while sorting
    public static Integer[] getTestData() {
        return Arrays.copyOf(a, a.length);
    }

    public static Integer[] getTestData(int size) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }


}
