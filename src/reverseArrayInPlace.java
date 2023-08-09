import java.util.Arrays;
import java.util.HashMap;

public class reverseArrayInPlace {
    public static void reverseArrayInPlace(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6};
        reverseArrayInPlace(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
