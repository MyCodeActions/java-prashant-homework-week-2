package homework;

import java.util.Scanner;
/**
 * Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {

        //input two values from user using scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Before swap, value of a is: "+a +" and Value of b is : "+b);

        // creating new varible temp for assigning temparary value
        int temp = a;  // assigning value of a to temp variable
        a = b;         // assigning value of b to a
        b = temp;      // assigning value of temp to b

        System.out.println("Swapping done......");
        System.out.println("After swap, value of a is: "+a +" and Value of b is : "+b);
    }
}
