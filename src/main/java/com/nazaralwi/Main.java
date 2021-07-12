package com.nazaralwi;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] data1 = new int[100];
        int[] data2 = new int[100];

        for (int i = 0; i < 100; i++) {
            data1[i] = random.nextInt(500);
            data2[i] = random.nextInt(500);
        }

        System.out.println("Before");
        System.out.println("Quick Sort -> " + Arrays.toString(data1));
        System.out.println("Merge Sort -> " + Arrays.toString(data2));

        System.out.println();

        System.out.println("After");
        QuickSort.quickSort(data1, 0, data1.length-1);
        MergeSort.sort(data2, 0, data2.length-1);

        System.out.print("Quick Sort -> ");
        QuickSort.printArray(data1, data1.length);

        System.out.print("Merge Sort -> ");
        MergeSort.printArray(data2);
    }
}
