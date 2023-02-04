package Java_Technical_Training;

import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seed number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();

        int seed = x;
        int num = x;
        while (seed != 0) {
            num = num * (seed % 10);
            seed = seed / 10;
        }
        if (num == y) {
            System.out.println(x + " is seed of " + y);
        } else {
            System.out.println(x + " is not seed of " + y);
        }
        sc.close();
    }
}

// // if (x >= y) {
// // x = x + y;
// // y = x - y;
// // x = x - y;
// // } // swaping the values
// int a = x, b = x;

// System.out.println("the numbers are " + a + " and " + b);

// while (b != 0) {
// a = b * (b % 10);
// b /= 10;
// }
// if (a == y) {
// System.out.println(x + " is a seed of " + y);
// System.exit(a);
// }
// System.out.println(x + " is not a seed of " + y);
