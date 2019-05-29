package code.challenges;

public class BinarySearch {

    // Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key.
    // Without utilizing any of the built-in methods available to your language, return the index of the array’s
    // element that is equal to the search key, or -1 if the element does not exist.

    public static int binarySearch(int[] arr, int key){
        int max = arr.length - 1;
        int min = 0;
        int mid;

        while(min <= max){
            mid = min + (max - min) / 2;

            if(arr[mid] == key){
                return mid;
            }else if(key < arr[mid]){
                max = mid - 1;
            }else {
                min = mid + 1;
            }

        }
        return -1;
    }
}
