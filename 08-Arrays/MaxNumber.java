
public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 7, 2, 33};
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
