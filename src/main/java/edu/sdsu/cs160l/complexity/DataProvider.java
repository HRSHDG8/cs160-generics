package edu.sdsu.cs160l.complexity;

import edu.sdsu.cs160l.model.Student;

import java.util.Arrays;
import java.util.Random;

public class DataProvider {

    private static final int SIZE = 1000;
    private static final Integer[] a = new Integer[SIZE];
    private static final Student[] s = new Student[SIZE];
    private static final Random r = new Random();

    static {
        for (int i = 0; i < SIZE; i++) {
            a[i] = r.nextInt();
            s[i] = new Student(r.nextLong(), "Student"+i,r.nextDouble());
        }
    }

    // return copy of the array since we are manipulating the original array while sorting
    public static Integer[] getTestData() {
        return Arrays.copyOf(a, a.length);
    }
    public static Student[] getTestStudents() {
        return Arrays.copyOf(s, s.length);
    }

    public static Integer[] getTestData(int size) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }


}
