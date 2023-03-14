package Java_Technical_Training;

/*
 * Pass by value and pass by reference in java
 */

class Calc {
    int p, q;

    Calc() {
        p = 10;
        q = 20;
    }
}

class PassByValue {
    void show(int x, int y) {
        x = x + 100;
        y = y + 50;
        System.out.println("Inside Function : The value of a is : " + x + " and b is : " + y);

    }

    void disp(Calc ref) {
        // ref has reference of c, there is a copy of reference
        System.out.println(" p is : " + ref.p + " q is : " + ref.q);
        ref.p++;
        ref.q--;
        System.out.println("In disc: p is : " + ref.p + " q is : " + ref.q);

    }
}

public class PassByValueVsPassByReference {
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        // int a = 10, b = 20;
        // System.out.println("Before function call : The value of a is : " + a + " and
        // b is : " + b);
        // obj.show(a, b);
        // System.out.println("After function call : The value of a is : " + a + " and b
        // is : " + b);

        Calc c = new Calc();
        obj.disp(c);
        // System.out.println(c.p + " " + c.q);
        System.out.println("In Main:  p is : " + c.p + " q is : " + c.q);

    }
}
