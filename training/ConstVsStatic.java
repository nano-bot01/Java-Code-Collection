package Java_Technical_Training;

/*
 * static block vs init block
 * static block vs init block vs constructor
 * if static is used in both parent and child class, the static block of parent class will run first
 */

class Q {
    static int a; // ! Eager Binding, Eager Loading
    int b; // ! instance variable, during object creation, lazy loading

    Q() {
        a = 20;
        System.out.println("priority 4: This is constructor ");
        b = 20;
    }

    {
        a = 10;
        System.out.println("priority 3: This is init block " + a);

    }
    // init is pre constructor call
    // initialize instance variable, same work as constructor
    // ! it ruins the readiablity of code

    static {
        a = 30;
        System.out.println("priority 1: Static Block will execute during class loading : " + a);
        // used to initialize static variables
        // pre logic or preprocessing before initilization
    }
    static {
        a = 40;
        System.out.println("priority 2: This is second static block " + a);
    }

    static void show() {
        System.out.println("A is : " + a);
    }
}

class Parents {
    static int x;
    static {
        x = 10;
        System.out.println("this is static from parents class : " + x);
    }
    static {
        System.out.println("this is second static block from parents class");
    }
    {
        System.out.println("I am the parent init block");
    }// inti block

    Parents() {
        System.out.println("I am parents class default constructor");
    }// constructor

}

class Child extends Parents {
    static int y;

    static {
        y = 0 + 10;
        System.out.println("this is static from child class  " + y);
    }
}

public class ConstVsStatic {
    public static void main(String[] args) {
        // Q.show();
        // Q obj = new Q();
        Child obj2 = new Child();

    }
}
