package Java_Technical_Training;

/*
 * can we override static method : no, as it is bind with class not objects
 * 
 * static - keyword, they are loaded once, bind with class name
 * static methods can be called without class objects
 * static is also present for objects
 * 
 * 
    
 }
 */

class StaticExample {
    int count; // instance variable
    static int counter; // class variable

    StaticExample() {
        count++; // ! instance variable, object bind ( runtime binding)
        counter++; // ! class variable, class bind, static bind
        System.out.println("Intance var count is : " + count + " Static var counter is : " + counter);
    }

    static void show() {
        System.out.println("I am  the show : ");
    }
}

class ParentClass {
    void disp() {
        System.out.println("I am the parent class display ");
    }
}

class ChildClass extends ParentClass {
    void disp() {
        System.out.println("I am the child class display ");
    }

    static void print() {
        System.out.println("I am static method of child class ");
    }
}
/*
 * overriding :
 * same signature as per parents is essential
 * inheritance must be present
 * depends on object creation
 */

public class StaticOverriding {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();
        StaticExample obj4 = new StaticExample();
        StaticExample.show();

        // overriding
        ChildClass obj5 = new ChildClass();
        obj5.disp();
        obj5.print();
        ChildClass.print();

        ParentClass obj6 = new ChildClass();
        obj6.disp(); //
        // obj6.print();

    }
}
