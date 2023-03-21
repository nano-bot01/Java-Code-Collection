package Java_Technical_Training;

/*
 * Steps : 
 *      1. create interface
 *      2. create class for implementation
 *      3. create objects 
 *      4. use object 
 */

@FunctionalInterface // tell it is SAM
interface calc {
    int compute(int x, int y);
}

// ! first way : create class, interface and do implemention using overriding
// ! second way : anonymous class(super implementation)
// ! third way : lambda expression (from java 8 version )
// ? short hand style, SAM interface implementation : single abstract method
// interface

// class mycalc implements calc {

// @Override
// public int compute(int x, int y) {
// return x + y;
// }

// }
class Rparent {

    void show() {
        System.out.println("I am the R show parents");
    }
}

// ! default keyword use
interface intt {
    void show();

    default void print() {
        System.out.println("1.  Print inside interface intt");
    }

    static void disp() {
        System.out.println("Static method inside interface intt");
    }
}

interface intt2 {
    default void print() {
        System.out.println("2.  Print inside interface intt2");
    }
}

interface intt3 extends intt, intt2 {
    default void print() {
        intt.super.print();
        intt2.super.print();
        System.out.println("3.  This is print inside interface intt3");
    }
}

public class InterfaceUseWays {
    public static void main(String[] args) {
        // calc obj = new mycalc();
        // int res = obj.compuete(45, 54);
        // System.out.println(res);

        // ! Anonymous class
        // during object creation we create a class

        calc obj = new calc() {
            public int compute(int x, int y) {
                return x * y;
            }
        };
        int r = obj.compute(54, 45);
        System.out.println("The result is : " + r);

        // ? third way
        // ! lambda function
        calc obj2 = (int a, int b) -> a + b;
        System.out.println("The result by lambda is : " + obj2.compute(54, 45));

        // ? bytecode genrated by lamda, merges the bytecodes, hence it is an advantage
        // ? of using lambda function

        // ! Anonymous class
        Rparent t = new Rparent() {
            void show() {
                System.out.println("R child show...");
                this.print();
            }

            void print() {
                System.out.println("R child print...");
            }
        };
        t.show();
        // t.print();

        // ! Anonymous class
        intt i = new intt() {
            public void show() {
                print();
                System.out.println("This is show of interface intt");
            }
        };
        i.show();
        intt.disp();
        System.out.println();

        // ! Anonymous class
        intt3 ii = new intt3() {
            public void show() {
                print();
                System.out.println("This is show of interface intt3");
            }
        };
        ii.print();
    }
}
