package sorts;

public class InsertionSort {

    public static int[] sort(int[] arr)
    {
        int length = arr.length;

        for (int index = 1; index < length; ++index) {

            int currentElement = arr[index];
            int adjacentElement = index - 1;

            while (adjacentElement >= 0 && arr[adjacentElement] > currentElement) {

                arr[adjacentElement + 1] = arr[adjacentElement];
                adjacentElement = adjacentElement - 1;

            }

            arr[adjacentElement + 1] = currentElement;


        }

        return arr;
    }

}
