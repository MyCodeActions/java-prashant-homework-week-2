package homework;
/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {

    // Here declaring two variables, a is static variable and b is instance variable
    static int a = 10;
    int b = 20;

    // creating instance m1 method and calling both variables
    public void m1() {
        System.out.println("This is instance m1 method");
        System.out.println("Value of static variable a is: " +a);
        System.out.println("Value of instance variable b is: " +b);
        System.out.println();
    }

    // creating static m2 method, creating object and calling both variable
    public static void m2() {
        Program3 obj = new Program3();
        System.out.println("This is static m2 method");
        System.out.println("Value of static variable a is: " + a);
        System.out.println("Value of instance variable b is: " + obj.b);
    }

    // calling both the methods
    public static void main(String[] args) {
        Program3 obj1 = new Program3();
        obj1.m1();
        m2();
    }
}