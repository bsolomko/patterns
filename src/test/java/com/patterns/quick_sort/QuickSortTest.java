package com.patterns.quick_sort;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuickSortTest {

    @Test
    void quickSortTest() {
        int[] actual = {6, 1, 2, 9, 4, 5, 8};
        int[] expected = {1, 2, 4, 5, 6, 8, 9};
        QuickSort.quickSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

}
