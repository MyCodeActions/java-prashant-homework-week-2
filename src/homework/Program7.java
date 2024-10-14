package homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */
public class Program7 {

    // creating method for expression and taking input from user using scanner
    public static double converToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double result = (5 * (f - 32)) / 9;
        sc.close();
        return result;
    }

    // calling method convertToCelsius
    public static void main(String[] args) {
        System.out.print("Converted temperature in Celsius is : " + converToCelsius());
    }
}
