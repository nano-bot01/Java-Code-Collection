package Java_Technical_Training;

import java.util.*;

public class JavaInput {
    public static void main(String[] args) throws Exception {
        main();
        main(4);
        // int first = Integer.parseInt(args[0]);
        // int second = Integer.parseInt(args[1]);
        // ! if one value is missing then array index out of bounds error will generated

        // int result = first + second;
        // System.out.println(result);

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("sum: " + Integer.toString(sum));

        System.out.println("Enter the name : ");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the age : ");
        int y = sc.nextInt();
        System.out.println(x);
        System.out.println(y);

        sc.close();

    }

    // private static Scanner Scanner(InputStream in) {
    // return null;
    // }

    public static void main(int m) {
        System.out.println("The power of " + m + " is : " + m * m);
    }

    public static void main() {
        System.out.println("This is user defined main ");
    }
}
