package homework;

import java.util.Scanner;
/**
 * . Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17 {
    // Create decimalToBinary method and get user input using scanner
    public static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);  // Convert the decimal number to binary
        System.out.println(+decimalNumber+"'s "+"Binary number is: " + binaryNumber);
        scanner.close();
    }

    // calling decimalToBinary method
    public static void main(String[] args) {
        decimalToBinary();
    }
}
