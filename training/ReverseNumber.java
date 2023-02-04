package Java_Technical_Training;

import java.util.Scanner;

public class ReverseNumber {

    int numberOfDigits(int n) {
        int i = 0;
        while (n != 0) {
            i++;
            n /= 10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");

        int n = sc.nextInt();
        System.out.println("The original number is : " + n);

        int result = reverse(n);
        System.out.println("The reversed number is : " + result);
        sc.close();
    }

    static int reverse(int n) {
        int r = 0, sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        return sum;
    }
}

     // final int x = numberOfDigits(n);
        // if (numberOfDigits(n) == numberOfDigits(result))
        // System.out.println("The reversed number is : " + result);
        // else {

        // }

