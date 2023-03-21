package Java_Technical_Training;

/*
 * Abstract class
 * 
 * we don't create object of abstract class as it is meaningless
 * abstract class constructor called calls itself
 * if class any abstract method then class must be abstract
 * 
 * 
 *  abstract method : no body, do defination , only declaration of function 
 */

abstract class loan {
    double deposit;
    String name;
    int id;

    loan() {
        System.out.println("This is constructor of loan class ");
    }

    void applyForLoan() {
        System.out.println("loan :: Apply for loan...");
    }

    abstract void emi();

    abstract void roi();

}

class homeLoan extends loan {
    homeLoan() {
        // super(); // calling parent class
        System.out.println("This is constructor of homeLoan ");
    }

    void insurance() {
        System.out.println("Home loan Insurance....");
    }

    void payBack() {
        System.out.println("Not charges applied...");
    }

    void emi() {
        System.out.println("The emi is 900 per month");
    }

    void roi() {
        System.out.println("The roi is 9 percent");
    }
}

// ! partial Abstract implementation
abstract class EduLoan extends Loan {
    void emi() {
        System.out.println("The emi is 900 per month");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // loan l = new loan();
        homeLoan loan = new homeLoan();

        loan.applyForLoan();
        loan.insurance();
        loan.payBack();
        loan.emi();
        loan.roi();

        // EduLoan l = new EduLoan();
        // l.emi();

    }
}
