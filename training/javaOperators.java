package Java_Technical_Training;

class Parents {

}

class A extends Parents {

}

class B extends Parents {

}

public class javaOperators {
    public static void main(String[] args) {
        // ! Types of operators:
        /*
         * Arithmetic operators (+,-,*,/)
         * Logical operators (&&, ||, ! )
         * Unary operators => (++x, --x, x++, x--)
         * Arithmetic Assignment operators (+=, -=, *=, /=)
         * Ternary operators (? : )
         * Relational operators (>,<, <=, >=, ==, = , !=)
         * Bitwise operators (&, !, ^, ~)
         * shifting operators are part of Bitwise operators ( >>, <<, >>>)
         */

        byte a = 10;
        byte b = 34;

        byte c = (byte) (a + b);
        // ? type conversion

        Parents obj = new A();
        Parents obj1 = new B();

        System.out.println(obj instanceof A);
        System.out.println(obj1 instanceof B);
        System.out.println(obj1 instanceof A);
        System.out.println(obj instanceof B);

        System.out.println(c);

        System.out.println("Logcal operators");
        System.out.println("100 & 39 == " + (100 & 39));
        System.out.println("100 | 39 == " + (100 | 39));
        Boolean res = true;
        System.out.println(!res);
        System.out.println(!!res);

        // ? when we use Arithmetic Assignment operators, we don't need to typecast the
        // variables
        System.out.println("Arithmetic Assignment operators: " + a + " " + b);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);

        System.out.println("Ternary operators");
        System.out.println(" a is " + a);
        String aa = a >= 50 ? "it is greater than 50" : "it is lower than ";
        System.out.println(aa);

        System.out.println(" a is " + a);
        System.out.println(" a is " + (a >> 1));
        System.out.println(" a is " + (a >> 2));
        System.out.println(" a is " + (a >> 3));
        System.out.println(" \n a is " + a);
        System.out.println(" a is " + (a << 1));
        System.out.println(" a is " + (a << 2));

        // ! difference between right shift and unsigned right shift

        int tt = 15;
        System.out.println(" tt = " + (tt >> 2));
        System.out.println(" tt = " + (tt >>> 2));
        // ? change left most digit while using unsigned right shift
    }
}
