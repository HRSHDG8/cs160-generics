package edu.sdsu.cs160l.sorter;

import java.util.Comparator;

public interface Sorter {

    void sort(Integer[] collection);

    void sort(Integer[] collection, Comparator<Integer> comparisonStrategy);
}
