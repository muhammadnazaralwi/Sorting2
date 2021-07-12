package com.nazaralwi;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        long start, end;
        long[] elapsedTime = new long[2];

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

        start = System.nanoTime();
        QuickSort.quickSort(data1, 0, data1.length-1);
        end = System.nanoTime();
        elapsedTime[0] = end - start;

        start = System.nanoTime();
        MergeSort.sort(data2, 0, data2.length-1);
        end = System.nanoTime();
        elapsedTime[1] = end - start;

        System.out.println("Quick Sort -> " + Arrays.toString(data1));
        System.out.println("Merge Sort -> " + Arrays.toString(data2));
        System.out.println();

        System.out.println("Time Comparison");
        System.out.println("Quick Sort vs Merge Sort");
        System.out.println(elapsedTime[0] + "ns" + " vs " + elapsedTime[1] + "ns");
    }
}
