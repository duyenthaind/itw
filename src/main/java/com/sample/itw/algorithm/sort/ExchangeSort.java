package com.sample.itw.algorithm.sort;

public class ExchangeSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++ ) {
            for (int jindex = index + 1; jindex < arr.length; jindex++ ) {
                if (arr[index] > arr[jindex]) {
                    int temp = arr[index];
                    arr[index] = arr[jindex];
                    arr[jindex] = temp;
                }
            }
        }
    }
}
