package Java_Technical_Training;

public class JavaBasics {

    public static void main(String args[]) {

        int id;
        id = 93;
        System.out.println(id);
        byte b = (byte) 256;
        System.out.println(b);

        boolean val = true;
        System.out.println(val);

        char ch = 'A';
        System.out.println(ch);

        // ? powershell supports unicode characters
        // ? char in java takes 2 bytes of space

        // ! byte, short, int, float, double, bool, char
        // ! values are immutable in java, but can replace
        // ! primitives or primary types

        // ! string literal object

        String name = "Ankit"; // array of bytes,total 12 bytes. here 10 bytes for name and 2 for null
                               // character to terminate String
        // ? name has reference to the original string
        String name2 = name;
        // now both name and name2 have both reference to the original string
        System.out.println(name);
        System.out.println(name2);

        String name3 = new String("Ankit");
        // ? new allocates a new memory to objects of this type
        System.out.println(name3);

        // reference compare

        System.out.println(" is name has same reference as name2 :  " + (name == name2)); // reference compare
        System.out.println(" is name has same reference as name3 :  " + (name == name3)); // reference compare
        System.out.println(" is name has same value as name 2 :  " + name.equals(name2)); // values compare

        String name4 = "ANKIT";
        System.out.println(name4);
        System.out.println(" is name has same value as name4 :  " + name.equalsIgnoreCase(name4)); // values compare

        System.out.println(" is name has same value as name4 using compareTo :  " + name.compareTo(name4));
        System.out.println(" is name has same value as name3 using compareTo :  " + name.compareTo(name3));

        // ! if +ve number then first string is bigger, if -ve then second string is
        // ! greater, else both are equal

        // ! Input in Java
        
    }
}
