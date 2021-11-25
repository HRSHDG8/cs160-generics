package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class BubbleSort implements Sorter {

    @Override
    public <T> void sort(T[] collection) {
        Comparable[] c = (Comparable[])collection;
        sort(c,  Comparator.naturalOrder());
    }

    @Override
    public <T> void sort(T[] c, Comparator<? super T> comparisonStrategy) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (comparisonStrategy.compare(c[j], c[j + 1]) > 0) {
                    T temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
    }
}
