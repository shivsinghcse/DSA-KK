
// idea: iterate over array from 0th index to n-1th index if target found return index otherwise return -1;

// Space complexity : O(1)
// Time complexity : best case: O(1), worst case: O(n)

public class FindTargetElement {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        System.out.println(linearSearch(arr, 14));
        System.out.println(linearSearch(arr, -14));
    }

    static int linearSearch(int[] arr, int target){
        int n = arr.length;

        if(n == 0){
            return -1;
        }

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
