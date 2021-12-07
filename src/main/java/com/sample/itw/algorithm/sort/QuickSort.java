package com.sample.itw.algorithm.sort;

public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr) {
        recursiveQuickSort(arr, 0, arr.length - 1);
    }

    private void recursiveQuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int pivot = arr[mid];
            int index = left, jindex = right;
            do {
                while (arr[index] < pivot) {
                    ++index;
                }
                while (arr[jindex] > pivot) {
                    --jindex;
                }
                if (index <= jindex) {
                    int temp = arr[index];
                    arr[index] = arr[jindex];
                    arr[jindex] = temp;
                    index++;
                    jindex--;
                }
            } while (index <= jindex);
            if (left < jindex) {
                recursiveQuickSort(arr, left, jindex);
                recursiveQuickSort(arr, index, right);
            }
        }
    }
}
