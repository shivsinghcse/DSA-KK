
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, -6));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0,
            end = arr.length-1;

        while(start <= end){
            // int mid = (start + end) / 2; // might be possible (start + end) exceed range of int 

            int mid = start + (end - start) / 2; // better way

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }    

        return -1;
    }
}


// Binary search is used to search in sorted arrays.
// take 2 pointers first = 0, last = n-1
// find middle element  = (first + last) / 2
// campare middle element with target
    // if(middle == target) -> element found
    // if(middle > target) --> last = mid - 1 (search in left)
    // if(middle < target) --> first = mid + 1 (search in right)
// do it while(start < end)    



// Why binary search??
// Q. Find max comarison in worst case?
    // target found on middle of array TC: O(1)
// Q. Find max comarison in worst case?
    // n/2 --> n/4 --> n/8 ---> .... --> 1
    // so n/2^k = 1 --> n = 2^k
    // logn = log2^k
    // logn = klog2 (since log2base2 = 1)
    //  logn = k 
    // TC: O(logn)
