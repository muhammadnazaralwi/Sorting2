package com.nazaralwi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        int[] data1 = {1, 4, 4, 8, 19, 302, 482, 544, 233};
        int[] data2 = {482, 544, 19, 302, 1, 4, 4, 8, 233};

        System.out.println("Before");
        System.out.println("Quick Sort -> " + Arrays.toString(data1));
        System.out.println("Merge Sort -> " + Arrays.toString(data2));

        System.out.println();

        System.out.println("After");
        QuickSort.quickSort(data1, 0, data1.length-1);
        mergeSort.sort(data2, 0, data2.length-1);

        System.out.print("Quick Sort -> ");
        QuickSort.printArray(data1, data1.length);

        System.out.print("Merge Sort -> ");
        MergeSort.printArray(data2);
    }
}
