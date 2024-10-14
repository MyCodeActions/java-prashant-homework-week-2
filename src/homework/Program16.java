package homework;

import java.util.Scanner;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class Program16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");            // Input binary number
        String binary1 = scanner.nextLine();
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();
        int decimal1 = Integer.parseInt(binary1, 2);            // Convert binary to decimal
        int decimal2 = Integer.parseInt(binary2, 2);
        int sumDecimal = decimal1 + decimal2;                         // Add the two decimal numbers
        String sumBinary = Integer.toBinaryString(sumDecimal);        // Convert the sum back to binary
        System.out.println("Sum of two binary numbers: " + sumBinary);
        scanner.close();
    }
}
