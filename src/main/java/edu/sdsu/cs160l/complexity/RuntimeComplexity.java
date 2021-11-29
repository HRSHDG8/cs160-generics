package edu.sdsu.cs160l.complexity;

import java.util.Arrays;
import java.util.function.Consumer;

public class RuntimeComplexity {
    public void constantTime(Integer[] a) {
        System.out.println(a.length);
    }

    public void linearTime(Integer[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] != 1) {
                //some operation
            }
        }
        //the code runs for n iterations and hence O(n)
    }

    public void quadraticTime(Integer[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i].equals(a[j])) {
                    //some operation
                }
            }
        }
        //the code runs for n*n iterations and hence O(n^2)
    }

    public static void main(String[] args) {
        Integer[] a = DataProvider.getTestData(100);
        RuntimeComplexity runtimeComplexity = new RuntimeComplexity();
        runWithTimeLog(runtimeComplexity::constantTime, a);
        runWithTimeLog(runtimeComplexity::linearTime, a);
        runWithTimeLog(runtimeComplexity::quadraticTime, a);
    }

    private static void runWithTimeLog(Consumer<Integer[]> linearTime, Integer[] a) {
        Integer[] copy = Arrays.copyOf(a, a.length);
        long start = System.nanoTime();
        linearTime.accept(copy);
        System.out.println("Time to execute :: " + (System.nanoTime() - start));
    }

}
