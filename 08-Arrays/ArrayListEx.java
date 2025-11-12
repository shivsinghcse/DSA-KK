import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(10);

        // adding element

        // al.add(5);
        // al.add(15);
        // al.add(25);
        // al.add(35);
        // al.add(45);

        // getting element
        // System.out.println(al.get(0)); //5

        // updating element
        // al.set(0, 99);
        // System.out.println(al.get(0)); //5

        // removing element
        // al.remove(2);

        // printing list at once
        // System.out.println(al); // [5, 15, 25, 35, 45]

        // check if element exist or not
        // System.out.println(al.contains(15));


        //Integer is a wrapper class

        // ArrayList<wrapper classes> al = new ArrayList<>(initialCapacity);

        // input
        for(int i=0; i<5; i++){
            al.add(sc.nextInt());
        }

        // System.out.println(al);

        // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(al.get(i)); // pass index here, list[index] syntax will not work here
        }


        // in arraylist size is actually fixed internally
        // for ex arraylist fills by some amount it will create a new empty arraylist may be of double size is created and old element are added into it.
        // TC: O(1) why??
    }
}
