package homework;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13 {

    // creating caculateNumbers method using three input parameter and return result
    public static double calculateNumbers(double a, double b, double c) {
        double result = (a + b + c) / 3;
        return result;
    }

    // calling calculateNumbers method using three diffrent inputs and print it
    public static void main(String[] args) {
        System.out.println(calculateNumbers(10, 30, 50));
        System.out.println(calculateNumbers(20.45, 33.98, 23.56));
        System.out.println(calculateNumbers(104, 4657, 47892));
    }
}
