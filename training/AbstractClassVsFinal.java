package Java_Technical_Training;

/*
 *  Abstract vs Final class
 *  abstract can't be used with variable wheres, final can be used with variables to make it constant
 *  abstract class used for inheritance, reusebility, final class is a freezed class, sealed class,
 *      so it can't be inherited to other classes 
 *  we can't create object of abstract class
 *  abstract methods are used for overriding, child can change beheavior, final methods prevent overriding.
 *  abstract class is useed with inheritance and inheritance tree, final class can either be used with single 
 *      inherited class.
 *  abstract class helps in abstraction while final helps us in restriction.
 * 
 */

final class ParentClass {
    // now we can't inherit, change this class

}

abstract class course {
    // generic class, have genral features
    int duration;
    double amount;
    String eligibility;

    abstract void apply();

}

class Eng extends course {
    void apply() {
        System.out.println("This is apply method in Eng course");
    }
}

class mgt extends course {
    void apply() {
        System.out.println("This is apply method in mgt course");
    }
}

class Account {
    final void WithDraw() {
        System.out.println("this is withdraw method,  can't be override by any of methods");
    }

    void deposit() {
        System.out.println("this is deposit, can be changed");
    }
}

public class AbstractClassVsFinal {
    public static void main(String[] args) {
        final int MAX = 100;// constant
        System.out.println("The value of max is : " + MAX);
        // MAX = 45; //! can't change

        Eng e = new Eng();
        e.apply();
        mgt m = new mgt();
        m.apply();
    }
}
