package edu.sdsu.cs160l.algorithm;

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

    static Integer[] getTestData() {
        return Arrays.copyOf(a, a.length);
    }


}
