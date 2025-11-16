// Ceiling : smallest element in array >= target

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
        int ans = findCeiling(arr, target);
        System.out.println(ans);
    }
    static int findCeiling(int[] arr, int target){
        int s = 0,
            e =  arr.length-1;

        if(target > arr[e]){
            return -1;
        }    

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(target > arr[mid]){
                s = mid + 1;
            }else if(target < arr[mid]){
                e = mid - 1;
            }else{
                return arr[mid];
            }
        }    
        return arr[s];
    }
}
