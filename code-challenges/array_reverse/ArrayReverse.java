import java.lang.reflect.Array;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] myTestArr = {2,4,6,8,10,12};
        reverseArray(myTestArr);

    }

    public static void reverseArray(int[] arr){

        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}
