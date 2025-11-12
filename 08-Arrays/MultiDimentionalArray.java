import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // syntax 
    // datatype[][] variablle_name = new datatype[row][col];
    /*
     * 
     * 1    2   3
     * 4    5   6
     * 7    8   9
     */

     // number of rows are compulsery, columns are not mandatory

     int[][] arr = {
        {1, 2, 3},
        {4, 5, 6}, 
        {7, 8, 9}
     };

     // In c, c++ this is also conntinous memory allocation
     // imagine this as an array of arrays.

    //  System.out.println(arr[1][0]);

     int[][] ar = {
        {1, 2, 3}, // 0th index
        {4, 5}, // 1st index
        {7, 8, 9} // 2nd index -> arr[2] = {7, 8, 9}
     };

    //  System.out.println(ar[1][2]); // java.lang.ArrayIndexOutOfBoundsException

    // input

    // System.out.println(arr.length); // no of rows

     for(int i=0; i<ar.length; i++){
        for(int j=0; j<ar[i].length; j++){
            ar[i][j] = sc.nextInt();
        }
     }

     // output

    //  for(int i=0; i<ar.length; i++){
    //     for(int j=0; j<ar[i].length; j++){
    //        System.out.print(ar[i][j] + " ");
    //     }
    //     System.out.println();
    //  }


    // for(int i=0; i<ar.length; i++){
    //        System.out.println(Arrays.toString(ar[i]));        
    //  }

     for(int[] a : ar){
        System.out.println(Arrays.toString(a)); 
     }
}
    
}