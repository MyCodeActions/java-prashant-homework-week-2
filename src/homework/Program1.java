package homework;
/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {

    // a and b both are instance variable
    int a = 10;
    int b = 20;

    // m1() is instance method and calling instance variable inside print method
    public void m1() {
        System.out.println("This is instance method");
        System.out.println("Instance Variable a is: " +a);
        System.out.println("Instance Variable b is: "+b);
    }

    // calling instance method m1() by using object
    public static void main(String[] args) {
        Program1 obj1 = new Program1();
        obj1.m1();
    }
}
