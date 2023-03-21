package Java_Technical_Training;

/*
 *  What is interface, why do we need it??
 *      it is a keyword in java, used to create standards or interfaces.
 *      it provides 100 % abstraction
 *      
 */

interface DBOperation {
    // ! 100 % abstract and public class

    int MAX_CONNECTIONS = 10;
    // ? public static final int MAX_CONNECTIONS = 10;
    // MAX_CONNECTIONS=20; // ? can't update this variable

    void add();

    void remove();

    void update();

    void read();
}

class OracleDB implements DBOperation {

    @Override
    public void add() {
        // MAX_CONNECTIONS = 20;
        System.out.println("This is add operation ");
    }

    @Override
    public void read() {
        System.out.println("This is read operation ");

    }

    @Override
    public void update() {
        System.out.println("This is update operation ");
    }

    @Override
    public void remove() {
        System.out.println("This is remove operation ");

    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        OracleDB obj = new OracleDB();
        obj.add();
        obj.read();
        obj.update();
        obj.remove();
    }

}
