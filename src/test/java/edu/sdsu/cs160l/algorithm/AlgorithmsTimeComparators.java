package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import static edu.sdsu.cs160l.algorithm.DataProvider.getTestData;

public class AlgorithmsTimeComparators {
    private final Sorter bubbleSort = new BubbleSort();
    private final Sorter quickSort = new QuickSort();

    @Test
    void sort() {
        Integer[] a = getTestData();
        long time = System.nanoTime();
        bubbleSort.sort(a);
        System.out.println("Time to bubble sort:: " + (System.nanoTime() - time));
        a = getTestData();
        time = System.nanoTime();
        quickSort.sort(a);
        System.out.println("Time to quick sort:: " + (System.nanoTime() - time));
    }
}
