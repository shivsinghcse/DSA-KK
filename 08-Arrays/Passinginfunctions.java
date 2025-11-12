import java.util.Arrays;

public class Passinginfunctions {
    public static void main(String[] args) {

        // passing array in function
        // we pass only reference variable
        
        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void change(int[] arr){ // copy of reference variable passed in this function, but it is pointing to same object
        arr[0] = 90;
    }

    // so orignal one is also changed because both pointing to same object, this is known as mutability (mutable behaviour)
    // arrays in java are mutablue (you can change object)
    // strings are immutable in java
}
