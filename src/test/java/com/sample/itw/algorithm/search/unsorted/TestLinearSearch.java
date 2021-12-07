package com.sample.itw.algorithm.search.unsorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinearSearch {
    @Test
    void testLinearSearchVoid() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {2, 3, 1, 5};
        int res = linearSearch.search(1, arr);
        Assertions.assertEquals(2, res);
    }
}
