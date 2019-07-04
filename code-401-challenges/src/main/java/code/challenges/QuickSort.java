package code.challenges;

public class QuickSort {

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int indexSmallerElemnt = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                indexSmallerElemnt++;

                // swap arr[i] and arr[j]
                int temp = arr[indexSmallerElemnt];
                arr[indexSmallerElemnt] = arr[j];
                arr[j] = temp;
            }
        }

        // swap/pivot arr[i+1] and arr[high]
        int temp = arr[indexSmallerElemnt+1];
        arr[indexSmallerElemnt+1] = arr[high];
        arr[high] = temp;

        return indexSmallerElemnt+1;
    }

    public static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, partitionIndex-1);
            sort(arr, partitionIndex+1, high);
        }
    }


}
