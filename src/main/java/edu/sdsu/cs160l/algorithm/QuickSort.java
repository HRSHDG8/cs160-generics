package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.sorter.Sorter;

import java.util.Comparator;

public class QuickSort implements Sorter {
    @Override
    public void sort(Integer[] c) {
        sort(c, Comparator.naturalOrder());
    }

    @Override
    public void sort(Integer[] collection, Comparator<Integer> comparisonStrategy) {
        quickSort(collection, 0, collection.length - 1, comparisonStrategy);
    }


    private void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(Integer[] arr, int low, int high, Comparator<Integer> comparisonStrategy) {
        Integer pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (comparisonStrategy.compare(arr[j], pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private void quickSort(Integer[] arr, int low, int high, Comparator<Integer> comparisonStrategy) {
        if (low < high) {
            int pi = partition(arr, low, high, comparisonStrategy);
            quickSort(arr, low, pi - 1, comparisonStrategy);
            quickSort(arr, pi + 1, high, comparisonStrategy);
        }
    }
}
