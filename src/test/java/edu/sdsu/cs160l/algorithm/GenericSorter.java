package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.model.Student;
import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static edu.sdsu.cs160l.complexity.DataProvider.getTestStudents;

public class GenericSorter {
    private final Sorter quickSort = new QuickSort();

    @Test
    void sort() {
        Student[] a = getTestStudents();
        try {
            quickSort.sort(a);
        } catch (Exception e) {
            System.err.println("Student is not comparable :: " + e.getMessage());
        }
        long time = System.nanoTime();
        quickSort.sort(a, Comparator.comparing(Student::getRedId));
        System.out.println("Time to run quick sort:: " + (System.nanoTime() - time));

    }
}
