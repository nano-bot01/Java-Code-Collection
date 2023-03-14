package Java_Technical_Training;

/* 
 * Method overloading and type promotion 
 * 
 * 
 * type promotion 
 * 
 * byte -> short -> int -> long -> double
 *                         long ->float-> double
 *                  int -> float -> double
 *                  int  -> double
 */

class TypePromotion {
    void show(byte x) {
        System.out.println(x + " : Byte ----");
    }

    void show(short x) {
        System.out.println(x + " : Short ----");
    }

    void show(String x) {
        System.out.println(x + " : String ----");
    }

    void show(int x) {
        System.out.println(x + " : Int ----");
    }

    void show(char x) {
        System.out.println(x + " : Char ----");
    }

    void show(float x) {
        System.out.println(x + " : float ----");
    }

    void show(int... x) {
        System.out.println(x + " : Var args ----");
    }

    // ! first chance given to primitive type, than it goes for var args then it
    // ! goes for Wrapper classes, then it shows error

    void show(Integer x) {
        System.out.println(x + " : Integer class ----");
    }

}

class Shopping {
    void search(double amount) {
        System.out.println("Product is available");
    }

    void search(String name) {
        System.out.println("Product is available");

    }

    void search(String name, double amount) {
        System.out.println("Product is unavailable");

    }

    void search(double amount, String name) {
        System.out.println("Product is unavailable");

    }

}

public class MethodOverloadingAndTypePromotion {
    public static void main(String[] args) {
        Shopping obj = new Shopping();
        obj.search("Apple");
        obj.search(80000.0);
        obj.search("Watch", 75000.0);
        obj.search(7500000.0, "Car");

        TypePromotion obj2 = new TypePromotion();
        obj2.show('A');
        obj2.show("ankit");
        obj2.show(34);
        obj2.show('A' + 10);// will converted to int
        obj2.show(34.5f);
        obj2.show(343443L);
        obj2.show(343443454L);
        obj2.show();
        obj2.show(10, 59);
        obj2.show(4543);

    }
}
