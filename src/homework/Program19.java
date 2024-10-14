package homework;
/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog
 */
public class Program19 {

    // convert value of name variable using toLowerCase method
    public static void main(String[] args) {
        String name = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println("Given String : "+name);
        System.out.println("Output is : "+name.toLowerCase());
    }
}
