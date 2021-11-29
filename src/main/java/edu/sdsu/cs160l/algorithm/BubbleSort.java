package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;

import java.util.Comparator;

public class BubbleSort implements Sorter {

    @Override
    public void sort(Integer[] c) {
        sort(c, Comparator.naturalOrder());
    }

    @Override
    public void sort(Integer[] c, Comparator<Integer> comparisonStrategy) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (comparisonStrategy.compare(c[j], c[j + 1]) > 0) {
                    swap(c, i, j);
                }
            }
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
