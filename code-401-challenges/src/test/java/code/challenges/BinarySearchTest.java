package code.challenges;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static code.challenges.BinarySearch.binarySearch;

public class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        int[] arr = {2,4,6,8,10,12,14,16,18,20};

        assertTrue("Binary Search: ", binarySearch(arr,18) == 8);
    }

    @Test
    public void testBinarySearch2(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        assertTrue("Binary Search: ", binarySearch(arr,3) == 2);
    }

    @Test
    public void testBinarySearch3(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        assertTrue("Binary Search: ", binarySearch(arr,5) == 4);
    }

    @Test
    public void testBinarySearch4(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        assertTrue("Binary Search: ", binarySearch(arr,20) == -1);
    }

    @Test
    public void testBinarySearchHighestIndex(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        assertTrue("Binary Search High Index: ", binarySearch(arr,10) == 9);
    }

    @Test
    public void testBinarySearchLowestIndex(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        assertTrue("Binary Search High Index: ", binarySearch(arr,1) == 0);
    }


}
