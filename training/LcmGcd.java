package Java_Technical_Training;

import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number  : ");
        int x = sc.nextInt();
        System.out.print("Enter the first number  : ");
        int y = sc.nextInt();

        System.out.println("The numbers are : " + x + " are " + y);
        int gcd = 0;

        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor is : " + gcd);
        int lcm = x * y / gcd;
        System.out.println("The least common divisor is : " + lcm);

        sc.close();
    }
}
