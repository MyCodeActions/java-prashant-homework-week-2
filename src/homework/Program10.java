package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 */
public class Program10 {

    // creating multiplication method for print multiplication table using scanner input
    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // Printing multiplication table using print statement
        System.out.println(number + " x 1 " + "= " + (number*1));
        System.out.println(number + " x 2 " + "= " + (number*2));
        System.out.println(number + " x 3 " + "= " + (number*3));
        System.out.println(number + " x 4 " + "= " + (number*4));
        System.out.println(number + " x 5 " + "= " + (number*5));
        System.out.println(number + " x 6 " + "= " + (number*6));
        System.out.println(number + " x 7 " + "= " + (number*7));
        System.out.println(number + " x 8 " + "= " + (number*8));
        System.out.println(number + " x 9 " + "= " + (number*9));
        System.out.println(number + " x 10 " + "= " + (number*10));
        sc.close();
    }

    // calling static mulitplication method directly
    public static void main(String[] args) {
        multiplication();
    }
}
