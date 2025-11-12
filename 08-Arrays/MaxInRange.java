
public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 7, 2, 33};
        System.out.println(findMax(arr, 2, 4));
    }

    static int findMax(int[] arr, int b, int c){
        
        int max = Integer.MIN_VALUE;

        for(int i=b; i<=c; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
