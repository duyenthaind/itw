package com.sample.itw.algorithm.sort;

public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int key = arr[index];
            int jindex = index - 1;
            while (jindex >= 0 && key < arr[jindex]) {
                arr[jindex + 1] = arr[jindex];
                jindex--;
            }
            arr[jindex + 1] = key;
        }
    }
}
