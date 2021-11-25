package edu.sdsu.cs160l.algorithm;

import edu.sdsu.cs160l.model.Student;
import edu.sdsu.cs160l.sorter.Sorter;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static edu.sdsu.cs160l.algorithm.DataProvider.getTestData;

class BubbleSortTest {

    private final Sorter bubbleSort = new BubbleSort();

    @Test
    void sortStudents() {
        Student[] i = new Student[]{
                new Student(1L, "Z", 1.0),
                new Student(1L, "H", 1.0),
                new Student(1L, "M", 1.0)
        };
        bubbleSort.sort(i, Comparator.comparing(Student::getName));

        for (Student a : i) {
            System.out.print(a);
        }
    }

    @Test
    void sort() {
        Integer[] a = getTestData();
        long time = System.nanoTime();
        for (int i : a) {
            int t = i + 1;
        }
        System.out.println("Time to iterate:: " + (System.nanoTime() - time));
        time = System.nanoTime();
        bubbleSort.sort(a);
        System.out.println("Time to sort bubble:: " + (System.nanoTime() - time));
    }


}