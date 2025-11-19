// package 33-OOPs-1;

public class Main {

   
    public static void main(String[] args) {
        // store 5 roll numbers
        // int[] roll_nos = new int[5];

        //  store of 5 names
        // String[] names = new String[5];

        // store data of 5 students {rollno, name, marks}
        // int[] roll = new int[5];
        // String[] names = new String[5];
        // float[] marks = new float[5];

        // creating object or instanse of Student class
        // just declaring
        // Student kunal;
        // System.out.println(kunal); // error: variable kunal might not have been initialized
        Student s1 = new Student("Akash", 15, 88.9f);
        System.out.println(s1);

        // s1.name = "Shiv Singh";
        // s1.rollno = 11;
        // s1.marks = 98.8f;
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks);

        s1.greeting();
        s1.changeName("Atul");
        s1.greeting();

        Student s2 = new Student("Kunal", 10, 88.0f);

        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks);
        s2.greeting();

        Student s3 = new Student(s2);
        System.out.println(s3.name);

        Student s4 = new Student();
        System.out.println(s4.name);

        Student one = new Student();
        Student two = one;

        two.name = "Something something";
        System.out.println(one.name);
    }

     // create a class
    static class Student {
        String name;
        int rollno;
        float marks = 90.5f;

        void greeting(){
            System.out.println("Hello my name is " + this.name);
        }

        void changeName(String name){
            this.name = name;
        }

        Student(Student other){
            this.name = other.name;
            this.rollno = other.rollno;
            this.marks = other.marks;
        }

        // constructor overloading

        // Student(){
        //     this.name = "Shiv Singh";
        //     this.rollno = 11;
        //     this.marks = 98.9f;
        // }


        Student() {
            // this is how you call a constructor from another constructor
            // internally: new Student();
            this("Default person", 00, 100.00f);
        }



        // Student arpit = new Student("arpit", 15, 99.9);
        // here, this will be replaced with "arpit" 
        Student(String name, int roll, float marks){
            this.name = name;
            this.rollno = roll;
            this.marks = marks;
        }
    }
}
