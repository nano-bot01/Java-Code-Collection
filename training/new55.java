package Java_Technical_Training;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private double basicSalary;
  private double hra;
  private double da;
  private double ta;
  private double ma;
  private double pf;
  private double gs;
  private double tax;

  public Employee(int id, String name, double basicSalary) {
    this.id = id;
    this.name = name;
    this.basicSalary = basicSalary;
  }

  public void calculate() {
    hra = basicSalary * 0.5;
    da = basicSalary * 0.15;
    ta = basicSalary * 0.20;
    ma = basicSalary * 0.20;
    pf = (basicSalary * 0.05) * 2;
    gs = basicSalary + hra + da + ta + ma;
    if (gs > 5000000) {
      tax = (gs > 7000000) ? (gs > 9000000 ? gs * 0.3 : gs * 0.2) : gs * 0.1;
    }
  }

  public void printSlip() {
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    System.out.println("Date: " + java.time.LocalDate.now());
    System.out.println("Employee ID: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Basic Salary: " + nf.format(basicSalary));
    System.out.println("House Rent Allowance: " + nf.format(hra));
    System.out.println("Dearness Allowance: " + nf.format(da));
    System.out.println("Travelling Allowance: " + nf.format(ta));
    System.out.println("Medical Allowance: " + nf.format(ma));
    System.out.println("Provident Fund: " + nf.format(pf));
    System.out.println("Gross Salary: " + nf.format(gs));
    System.out.println("Tax: " + nf.format(tax));
    System.out.println("Net Salary: " + nf.format(gs - tax));
  }

}

public class new55 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Basic Salary: ");
    double basicSalary = sc.nextDouble();
    Employee emp = new Employee(id, name, basicSalary);
    emp.calculate();
    emp.printSlip();
    sc.close();
  }
}
