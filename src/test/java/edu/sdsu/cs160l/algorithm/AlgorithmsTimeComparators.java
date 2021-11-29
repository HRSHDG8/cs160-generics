package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import static edu.sdsu.cs160l.complexity.DataProvider.getTestData;

public class AlgorithmsTimeComparators {
    private final Sorter bubbleSort = new BubbleSort();
    private final Sorter quickSort = new QuickSort();
    private final Sorter mergeSort = null; //TODO replace this with your MergeSort class

    @Test
    void sort() {
        Integer[] a = getTestData();
        long time = System.nanoTime();
        bubbleSort.sort(a);
        System.out.println("Time to run bubble sort:: " + (System.nanoTime() - time));

        a = getTestData();
        time = System.nanoTime();
        quickSort.sort(a);
        System.out.println("Time to run quick sort:: " + (System.nanoTime() - time));

        a = getTestData();
        time = System.nanoTime();
        mergeSort.sort(a);
        System.out.println("Time to run merge sort:: " + (System.nanoTime() - time));
    }
}
