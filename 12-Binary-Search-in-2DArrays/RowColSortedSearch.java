import java.util.Arrays;

public class RowColSortedSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };

        System.out.println(Arrays.toString(search(matrix, 14)));
        System.out.println(Arrays.toString(search(matrix, 26)));
        System.out.println(Arrays.toString(search(matrix, 55)));
    }

    static int[] search(int[][] ar, int target) {
        int r = 0,
                c = ar.length - 1;

        while (r < ar.length && c >= 0) {
            if (ar[r][c] == target) {
                return new int[] { r, c };
            }
            if (target > ar[r][c]) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }
}

// given a row and col wise sorted 2d matrix search an element in it
// idea:
// we start at top-right corner
// if(target == matrix[r][c]) -> return position
// if(target > matrix[r][c]) -> move down (r++)
// if(target < matrix[r][c]) -> move left (c--)
// Continue until r < rows && c >= 0

// Time: O(n + m) (better than O(n*m))
// Space: O(1)