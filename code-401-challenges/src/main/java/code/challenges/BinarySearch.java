package code.challenges;

public class BinarySearch {

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
