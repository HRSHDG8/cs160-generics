package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import static edu.sdsu.cs160l.complexity.DataProvider.getTestData;

class QuickSortTest {

    private final Sorter quickSort = new QuickSort();

    @Test
    void sort() {
        Integer[] a = getTestData();
        long time = System.nanoTime();
        for (int i : a) {
            int t = i + 1;
        }
        System.out.println("Time to iterate:: " + (System.nanoTime() - time));
        time = System.nanoTime();
        quickSort.sort(a, (o1, o2) -> o2 - o1);
        System.out.println("Time to sort bubble:: " + (System.nanoTime() - time));
    }


}