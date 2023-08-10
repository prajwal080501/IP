import java.util.Arrays;

public class SecondMax {
    public static int secondMaxElement(int[] arr){
       int[] result = SortArray.sortArray(arr);
       int secondMax = result[result.length - 1];
        System.out.println(Arrays.toString(result));
       return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1,5,98,3,21};
        System.out.println(secondMaxElement(arr));
    }
}
