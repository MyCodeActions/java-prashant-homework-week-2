package homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Program6 {

    // declaring two static variables in which one is final variable
    static final double PI = 3.14285714;
    static double radius;

    // creating method for calculating area of circle
    public double circleArea() {
        double area = PI * radius * radius;
        return area;
    }

    // taking input from user using scanner and calling circleArea method
    public static void main(String[] args) {
        Program6 obj = new Program6();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        radius = sc.nextDouble();
        System.out.println("Area of circle is : "+obj.circleArea());
        sc.close();
    }
}
