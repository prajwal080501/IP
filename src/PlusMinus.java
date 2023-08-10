public class PlusMinus {


    public static void plusMinus(int[] arr){
        int length = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > 0){
                positiveCount += 1;
            } else if (arr[i] < 0) {
                negativeCount += 1;
            }
            else {
                zeroCount +=1;
            }
        }
        System.out.println(positiveCount / length);
        System.out.println(negativeCount / length);
        System.out.println(zeroCount / length);
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, -1, -1};
        plusMinus(arr);
    }
}
