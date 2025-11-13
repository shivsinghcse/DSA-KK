

public class SearchInRange {
    public static void main(String[] args) {
      int[] var1 = new int[]{18, 12, 9, 14, 77, 50};
      System.out.println(linearSearch(var1, 14, 1, 3));
      System.out.println(linearSearch(var1, 14, 0, 2));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        int n = arr.length;

        if(n == 0){
            return -1;
        }

        if(start > end){
            return -1;
        }

        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}

