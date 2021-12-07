package com.sample.itw.algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSort {

    int[] arr = {2, 1, 5, 6, 3, 4, 4};
    int[] expected = {1, 2, 3, 4, 4, 5, 6};

    @Test
    void testExchangeSort() {
        ExchangeSort exchangeSort = new ExchangeSort();
        exchangeSort.sort(arr);
        Assertions.assertArrayEquals(arr, expected);
    }

    @Test
    void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        Assertions.assertArrayEquals(arr, expected);
    }

    @Test
    void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        Assertions.assertArrayEquals(arr, expected);
    }

    @Test
    void insertionSort(){
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        Assertions.assertArrayEquals(arr, expected);
    }

    @Test
    void quickSort(){
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        Assertions.assertArrayEquals(arr, expected);
    }
}
