package Java_Technical_Training;

public class GCD {

    static int computeGCD(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        int x = a, y = b;

        int min = x < y ? x : y;
        // ! first method

        while (min > 0) {
            if (x % min == 0 && y % min == 0) {
                System.out.println("GCD is : " + min);
                break;
            }
            min--;
        }
        x = a;
        y = b;

        // ! euclidian algo(sub method)

        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        } // ? result will be stored in x
        System.out.println("GCD is : " + x);

        x = a;
        y = b;

        // ! division method
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        } // ? result will be stored in y
        System.out.println("GCD is : " + y);

        int nums[] = { 40, 42, 44, 48 };
        int m = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            m = computeGCD(m, n);
        }
        System.out.println("The gcd of nums array is " + m);
    }

}
