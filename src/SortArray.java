import java.util.Arrays;

public class SortArray {
//    bubble sort
    public static int[] sortArray(int[] arr){
        int size = arr.length - 1;
        for (int i = 0; i < size - i; i++){
            for (int j = 0; j <= size - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int result[] = arr;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3,8,7};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
