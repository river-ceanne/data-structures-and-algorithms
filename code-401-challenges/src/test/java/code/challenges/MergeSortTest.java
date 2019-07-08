package code.challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testInsertionTestReg(){

        int[] arr = {2,9,8,3,6,1};
        int[] expected = {1,2,3,6,8,9};

        assertArrayEquals(expected,MergeSort.sort(arr, arr.length));

    }

    @Test
    public void testInsertionTestReverse(){

        int[] arr = {9,8,7,6,5,4,3};
        int[] expected = {3,4,5,6,7,8,9};

        assertArrayEquals(expected,InsertionSort.sort(arr));

    }

    @Test
    public void testInsertionTestSorted(){

        int[] arr = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};

        assertArrayEquals(expected,InsertionSort.sort(arr));

    }

    @Test
    public void testInsertionTestEmpty(){

        int[] arr = {};
        int[] expected = {};

        assertArrayEquals(expected,InsertionSort.sort(arr));

    }
}
