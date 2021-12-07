package com.sample.itw.algorithm.sort;

public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            int minIndex = index;
            for (int jindex = index + 1; jindex < arr.length; jindex++) {
                if (arr[minIndex] > arr[jindex]) {
                    minIndex = jindex;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temp;
        }
    }
}
