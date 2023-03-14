package Java_Technical_Training;

//! we can't override both private and final methods
//? we can override by making them run time bind

class Loan {
    private void emi() {
        System.out.println("ROI is 9%");
    }// it never inherits to child class

    void show() {
        emi();// using private emi()
    }

    final void emi2() {
        System.out.println("this is loan class : ROI is 8%");
        // ! final keywords prevents overriding
    }

    static void emi3() {
        System.out.println("ROI is 10%");
    }
}

class EduLoan extends Loan {
    static void emi() {
        System.out.println("ROI is 17%");
    }
    // void emi2() {
    // System.out.println("ROI is 9%");
    // // Cannot override the final method from Loan
    // ! final keywords prevents overriding
    // }
    // ! hence due to declaration final in emi2

}

public class OverridePrivateFinalStatic {
    public static void main(String[] args) {
        EduLoan obj = new EduLoan();
        EduLoan.emi();
        obj.emi2();
        // obj.emi3();
    }
}
