package homework;

import java.util.Scanner;
/**
 * Write a program to calculate the area of a triangle
 */
public class Program8 {

    // creating method for calculating area and take inputs from user using scanner class and return result
    public double area() {
        Scanner sc = new Scanner(System.in);
        double width, height, area;
        System.out.print("Enter widht of Triangle : ");
        height = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        width = sc.nextDouble();
        area = (width * height) / 2;
        sc.close();
        return area;
    }

    // calling area method by using object
    public static void main(String[] args) {
        Program8 obj = new Program8();
        System.out.print("Area of Triangle is : " + obj.area());
    }
}
