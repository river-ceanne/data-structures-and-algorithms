package code.challenges;

public class MergeSort {

    public static int[] sort(int[] arr, int n)
    {
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] leftSegment = new int[mid];
        int[] rightSegment = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftSegment[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            rightSegment[i - mid] = arr[i];
        }

        sort(leftSegment, mid);
        sort(rightSegment, n - mid);

        merge(arr, leftSegment, rightSegment, mid, n - mid);

        return arr;
    }

    public static void merge(int[] arr, int[] leftSegment, int[] rightSegment, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (leftSegment[i] <= rightSegment[j]) {
                arr[k++] = leftSegment[i++];
            }
            else {
                arr[k++] = rightSegment[j++];
            }

        }
        while (i < left) {
            arr[k++] = leftSegment[i++];
        }
        while (j < right) {
            arr[k++] = rightSegment[j++];
        }

    }

}//end of class
