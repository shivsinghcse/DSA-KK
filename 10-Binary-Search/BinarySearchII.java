

public class BinarySearchII {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(orderAgnosticBS(arr, 6));
        System.out.println(orderAgnosticBS(arr, -6));
    }

    static int orderAgnosticBS(int[] arr, int target){

        if (arr == null || arr.length == 0) return -1;
        
        int start = 0,
            end = arr.length-1;

        boolean isAsc = arr[start] <= arr[end];    

        while(start <= end){
            
            int mid = start + (end - start) / 2; // better way

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
            
        }    

        return -1;
    }

}


// Order agnostic Binary Search
 
// Given that array is sorted
// how to find that : asc or desc
// compare first and last element
    // if(arr[s] <= arr[e])--increasing order sorder 
    // else decreasing order sorted
// according that use binary search