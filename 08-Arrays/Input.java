import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // [1, 2, 3, 4, 5]
        // System.out.println(arr[2]);

        // input using for loop

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // sc.close();

        // printing array

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();
        // for each loop

        // for(int num: arr){ // for every element in array, print the element
            // System.out.print(num + " "); // here num represent element of the array
        // }

        // System.out.println(arr[5]); // index out of bound error
        // System.out.println(arr[-1]); // index out of bound error

        // System.out.println();


        // System.out.println(Arrays.toString(arr)); // [7, 89, 6, 3, 2]
        // convert array into string and prints, internally using for loop - check??

        // array of objects

        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // in stack str is stored pointing in the heap memory
        // heap memory contains array of size 4, it have 4 reference variables of 4 different objects, thats why by default null value

       
    }
}
