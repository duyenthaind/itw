package com.sample.itw.algorithm.search.unsorted;

import com.sample.itw.algorithm.search.SearchAlgorithm;

public class LinearSearch implements SearchAlgorithm {
    @Override
    public int search(int key, int[] arr) {
        for (int index = -1; ++index < arr.length; ) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
