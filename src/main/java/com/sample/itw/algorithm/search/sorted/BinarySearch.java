package com.sample.itw.algorithm.search.sorted;

import com.sample.itw.algorithm.search.SearchAlgorithm;

public class BinarySearch implements SearchAlgorithm {

    @Override
    public int search(int key, int[] arr) {
        return loopImplementation(key, arr);
    }

    public int recursiveImplementation(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return recursiveImplementation(arr, left, mid - 1, key);
            } else {
                return recursiveImplementation(arr, mid + 1, right, key);
            }
        }
        return -1;
    }

    public int loopImplementation(int key, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
