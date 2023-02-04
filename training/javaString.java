package Java_Technical_Training;

import java.util.Date;

public class javaString {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String name = "Ankit";
        String name2 = "Ankit";

        System.out.println(name + name2);

        String name3 = new String("Ankit");
        System.out.println(name3);
        String name4 = new String("Amit");
        System.out.println(name4);

        // ! Immutablility of strings

        String type = "Shoes";
        System.out.println(type);
        // String sql = "Select * from products where type = " + type;
        StringBuffer sql = new StringBuffer("Select * from products where type = "); // ? capacity = 16 characters
        // sql = "Select * from products where type = " + type; // ? capacity = 16
        // characters + length of

        System.out.println("length = " + sql.length() + "\n capacity = " + sql.capacity());

        double price = 3999;
        sql.append("and price >= ").append(price);

        sql.append("my name is ankit nainwal and that is all ").append(price);
        System.out.println(sql);
        System.out.println("length = " + sql.length() + "\n capacity = " + sql.capacity());

        /*
         * //! Stringbuffer creates buffer storage with 16 characters
         * 
         * string bulider comes after java 5, it is not synchronized and do not
         * obtains locks
         * to use string builder we can make synchronized block usng lock
         * ?
         * StringBuilder str = new StringBuilder("hello");
         * System.out.println(str);
         */

        /*
         * reference type : String, StringBuffer, StringBulder, Wrapper types(it wraps
         * all the primitive types of data types)
         * 
         * here Integer b is immutable, and belongs to wrapper class of Integer
         * 
         * 
         * 
         */

        int a = 10;
        Integer b = 20;
        Float c = 34.3f;
        Double t = 454.45;
        Boolean istrue = true;
        Character ch = 'A';

        System.out.println(a + " " + b + " " + " " + c + " " + t + " " + istrue + " " + ch);
        System.out.println("Binary of a is : " + Integer.toBinaryString(a));

        System.out.println(Character.isLowerCase('A'));

        // LinkedList<String> list = new LinkedList<>();

        Date d = new Date();
        System.out.println("The Date is : " + d);

    }
}
