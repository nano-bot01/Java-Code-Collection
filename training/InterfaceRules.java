package Java_Technical_Training;

import static java.lang.System.out;

interface Q {
    int MAX = 10; // public static final int MAX = 10;

    void show(); // public abstract void show();

    void print();
}

interface K {
    int MAX = 200;

    void show();
}

interface J extends Q, K {
    void print();
    // ! one interface can extends more than one interfaces at a time
}

class H implements J {
    public void print() {
        System.out.println(" Q.max is : " + Q.MAX);
        System.out.println(" K.max is : " + K.MAX);
        System.out.println("This is print in H class ");
    }

    public void show() {
        out.println("This is show in H class ");
    }
}

public class InterfaceRules {
    public static void main(String[] args) {
        H obj = new H();
        obj.show();
        obj.print();
    }
}
