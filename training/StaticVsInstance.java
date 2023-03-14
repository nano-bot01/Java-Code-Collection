package Java_Technical_Training;

class Demo {
    int a; // lazy loading, during object creation
    static int b; // class member (eager loading, during class loading)

    static {
        b = 1;
        System.out.println("this is static : b == " + b);
    }

    static void show() {
        // a = 1000; // ! Cannot make a static reference to the non-static field
        System.out.println(" Show : " + b);
    }// static methods

    Demo() {
        b++;
        System.out.println("This is constructor here a is : " + a + " and b is : " + b);
    }

    void print() {
        System.out.println(" This is print : " + b);
        // we can also use static variables in instance variable
        // we can access eager variables in lazy varables and methods but its opposite
        // is not true;
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        Demo.show();// only static values can be used
        Demo ob = new Demo();
        ob.print();

        Demo ob2 = new Demo();
        Demo ob3 = new Demo();
        Demo ob4 = new Demo();
        // a is creating in heap 4 times as it is an instance varaible, but b is created
        // once.

    }
}
