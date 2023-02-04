package Java_Technical_Training;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, -1);
        }
        System.out.println("The sum of series of " + n + " numbers is " + sum);
        sc.close();
    }

}
