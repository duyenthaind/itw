package com.sample.itw.algorithm.sort;

public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            for (int jindex = 0; jindex < arr.length - index - 1; jindex++) {
                if (arr[jindex] > arr[jindex + 1]) {
                    int temp = arr[jindex];
                    arr[jindex] = arr[jindex + 1];
                    arr[jindex + 1] = temp;
                }
            }
        }
    }
}
