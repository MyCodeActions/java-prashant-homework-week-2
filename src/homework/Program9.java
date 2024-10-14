package homework;

import java.util.Scanner;
/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9 {

    // creating method to get string input from user
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name in upper case : ");
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    // calling inputString method and convert it in to lowercase by using toLowerCase method
    public static void main(String[] args) {
        System.out.print("Your name in lower case is : "+inputString().toLowerCase());
    }
}
