package Java_Technical_Training;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        flag = isPrime1(n);
        System.out.println("Is " + n + " is prime using first function : " + flag);
        flag = false;
        flag = isPrime2(n);
        System.out.println("Is " + n + " is prime using efficient function : " + flag);
        flag = false;
        flag = isPrime3(n);
        System.out.println("Is " + n + " is prime using optimized function : " + flag);
        sc.close();
    }

    static boolean isPrime1(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime3(int n) {
        if (n == 1)
            return false;
        if ((n == 2 || n == 3))
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i < Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

}
