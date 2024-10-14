package homework;
/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 */
public class Program12 {

    // calling expression method
    public static void main(String[] args) {
        expression();
    }

    // creating method for calculation expression
    public static void expression() {
        double exp = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("The result of expression is : " + exp);
    }
}
