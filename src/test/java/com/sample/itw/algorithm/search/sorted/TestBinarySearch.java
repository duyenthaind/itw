package com.sample.itw.algorithm.search.sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinarySearch {

    final BinarySearch binarySearch = new BinarySearch();
    final int key = 4;
    final int[] arr = {1, 2, 3, 4, 6, 8};

    @Test
    void testSearchRecursive() {
        Assertions.assertEquals(3, binarySearch.recursiveImplementation(arr, 0, arr.length - 1, key));
    }

    @Test
    void testSearchLoop(){
        Assertions.assertEquals(3, binarySearch.search(key, arr));
    }
}
