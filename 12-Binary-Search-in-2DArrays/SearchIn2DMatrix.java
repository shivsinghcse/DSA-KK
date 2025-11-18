import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
        {10, 3, 7, 5},
        {8, 12, 1, 6},
        {14, 2, 9, 4},
        {11, 13, 0, 15}
        };

        System.out.println(Arrays.toString(search(matrix, 13)));
        System.out.println(Arrays.toString(search(matrix, 19)));
    }

    static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


// given a 2d matrix and target return indexes
// Idea: goto each cell and compare with target
// TC: O(n*m)
// SC: O(1)

