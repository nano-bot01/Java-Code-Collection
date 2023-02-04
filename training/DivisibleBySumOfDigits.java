package Java_Technical_Training;

import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number  : ");
        int x = sc.nextInt();
        System.out.print("The number is : " + x);

        int y = sumOfDigits(x);
        System.out.println("\nthe sum of digits is : " + y);

        if (x % y == 0)
            System.out.println("the number is divisible by its sum of digits");
        else
            System.out.println("the number is not divisible by its sum of digits");

        sc.close();
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
