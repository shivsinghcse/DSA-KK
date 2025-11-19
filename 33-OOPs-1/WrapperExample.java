public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num = new Integer(12); // depricated since java9
        Integer num1 = 15;
        int b = 20;

        swap(a, b);
        swap(num, num1);

        System.out.println(a +", " + b); // not swap  because java is passed by  value only
        System.out.println(num +", " + num1); // not swap  because java is passed by  value only, passing copy of reference variable

        // num and num1 are objects of Integer type

        final int bonus = 3;
        // bonus = 4; // final variable can not be modified, and always initilize while declaring

        final A kk = new A("Kush waha");
        kk.name = "ku nal";

        // when a non-primitive is final, you can not reassign it
        // kk = new A("other object");

        A obj;

        for(int i=0; i<100000000; i++){
            obj = new A("random object");
        }
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }

    static class A{
        final int num = 10;
        String name;

        A(String name){
            System.out.println("object is being created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            // TODO Auto-generated method stub
            // super.finalize();

            System.out.println("object is destroyed.");
        }
    }
}

