import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        swap(nums, 2, 5);
    }
    static void swap(int[] arr, int b, int c){
        int temp = arr[b];
        arr[b] = arr[c];
        arr[c] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
