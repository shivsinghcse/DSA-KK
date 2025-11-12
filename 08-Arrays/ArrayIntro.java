public class ArrayIntro {

    public static void main(String[] args){
        // Q: Store a roll number
        int a = 19;

        // Q: store a person's name?
        String name = "Kunal Kushwaha";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 25;
        int rno3 = 26;


        // syntax 
        // datatype[] variable_name = new datatype[size];
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {24, 34, 11, 38, 10};


        
        int[] ros; // declaration of array, ros is getting defined in the stack, right now no pointing to nothing

        // ros is a reference variable - it is created in compile time

        ros = new int[6]; // initialisation: actually here object is being created in the memory (heap), and address of the object is stored in the stack in "ros"
        // and the actual object creating in the heap happens in runtime, this is known as dynamic memory allocation (at the runtime memory is allocated)

        // array indexing always starts from 0
        // array in c, c++ stores in continous memory location
        // but in java there is no concept such as pointers, so it totaly depends on jvm weather this is going to continous or not 
        //Why?? (check JLS - java language specification)
        // 1. Array objects, and other objects are stored in heap
        // 1.1. check JLS - java language specification: here they mentioned that "heap objects are not continous"
        // 2. "heap objects are not continous"
        // 3. Dynamic memory allocation
        // hence: In Java may not be continuous - Depends on JVM

        int[] arr = {10, 20, 30};
        // accessing array element
        System.out.println(arr[1]);
        // updating element
        arr[1] = 22;

        // new keyword : is used to create an object, {1, 2, 3} this is also internally doing same thing

        String[] str = new String[4];
        System.out.println(str[0]); // null

        // null : is a special literal of null type, you can cast/assign it to any particular reference type
        // null a = null; ❌

        String str1 = null; // ✅
        int num = null; // ❌ you  can not assign it to primitive, only can assign to non-primitive

        // any reference variable is by default is of null type, it is not datatype it is a special value

        // String[] ar = new String[5]; // do it later

    }
}