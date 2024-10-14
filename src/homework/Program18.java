package homework;

import java.util.Scanner;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class Program18 {
    // creating two static variable
    static double a;
    static double b;

    // creating addition mehtod for sum
    public double addition() {
        double result = a+b;
        return result;
    }

    // creating multiply method for multiplication
    public double multiply() {
        double result = a*b;
        return result;
    }

    // creating subtract method for subtraction
    public double subtract() {
        double result = a-b;
        return result;
    }

    // creating divide method for division
    public double divide() {
        double result = a/b;
        return result;
    }

    // creating modulo method for remainder
    public double modulo() {
        double result = a%b;
        return result;
    }

    // taking inputs from user and calling all methods for addition, multiplication, subtraction, division and remainder
    public static void main(String[] args) {
        Program18 obj = new Program18();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        a = sc.nextInt();
        System.out.print("Enter value of b : ");
        b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is:  " + obj.addition());
        System.out.println("The multiply of " + a + " and " + b + " is:  " + obj.multiply());
        System.out.println("The subtract of " + a + " and " + b + " is:  " + obj.subtract());
        System.out.println("The division of " + a + " and " + b + " is:  " + obj.divide());
        System.out.println("The remainder of " + a + " and " + b + " is:  " + obj.modulo());
        sc.close();
    }
}
