package code.challenges;


public class ArrayShift {
    public static void main(String[] args) {
        int[] test1 = {1,2,4,5};
        int[] test1Res = insertShiftArray(test1,3);

        for(int i = 0; i < test1Res.length; i++) System.out.println(test1Res[i]);

    }

    public static int[] insertShiftArray(int[] arr, int num){
        int[] shiftedArr = new int[arr.length + 1];
        int mid = (int) (arr.length / 2);

        for(int i = 0; i < shiftedArr.length; i++){
            if(i < arr.length / 2){
                shiftedArr[i] = arr[i];
            }else if(i == mid){
                shiftedArr[mid] = num;
            }else{
                shiftedArr[i] = arr[i - 1];
            }
        }
        return shiftedArr;
    }
}
