package edu.sdsu.cs160l.sorter;

import java.util.Comparator;

/**
 * Sorter is now generified using method level generics
 */
public interface Sorter {

    <T> void sort(T[] collection);

    <T> void sort(T[] collection, Comparator<? super T> comparisonStrategy);
}
