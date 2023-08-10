public class LastOccurence {
    public static int lastOccurence(int[] arr, int target){
        int lastIndex = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if(arr[i] == target){
                lastIndex = i;
                break;
            }
        }

        return  lastIndex;
    }
    public static void main(String[] args) {
        int[] myArr = {1,2,5,3,8,8,8};
        System.out.println(lastOccurence(myArr, 3));
    }
}
