package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import static edu.sdsu.cs160l.complexity.DataProvider.getTestData;

public class MergeSortTest {
    private final Sorter mergeSort = null;//TODO replace this with your MergeSort class

    @Test
    void sort() {
        Integer[] a = getTestData();
        long time = System.nanoTime();
        for (int i : a) {
            int t = i + 1;
        }
        System.out.println("Time to iterate:: " + (System.nanoTime() - time));
        time = System.nanoTime();
        mergeSort.sort(a);
        System.out.println("Time to sort bubble:: " + (System.nanoTime() - time));
    }
}
