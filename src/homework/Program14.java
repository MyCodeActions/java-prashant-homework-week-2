package homework;
/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 */
public class Program14 {
    // creating instance final variable width and height which are static
    final static double WIDTH = 5.5;
    final static double HEIGHT = 8.5;


    // creating rectangleArea method
    public static double rectangleArea() {
        double area = WIDTH * HEIGHT;
        return area;
    }

    // creating rectanglePerimeter method
    public static double rectanglePerimeter() {
        double perimeter = 2 * (WIDTH+HEIGHT);
        return perimeter;
    }

    //calling rectangleAra and rectanglePerimeter method
    public static void main(String[] args) {
        System.out.println("The Area of rectangle is : "+rectangleArea());
        System.out.println("The perimeter of rectangle is: "+rectanglePerimeter());
    }
}
