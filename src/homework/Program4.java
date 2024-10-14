package homework;
/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */

public class Program4 {

    // Declaring instance and static variable
    double a = 10.3;
    double b =20.9;
    static String firstName = "Prashant";
    static String lastName = "Korat";

    // creating instance method and calling instance and static variables
    public void m1() {
        System.out.println("This is instance method");
        System.out.println("Value of instance variable a is : "+a);
        System.out.println("Value of instance variable b is : "+b);
        System.out.println("Value of static variable firstName is : " +firstName);
        System.out.println("Value of static variable lastName is  : "+lastName);
        System.out.println();
    }

    // creating static method, creating object and calling instance and static variables
    public static void m2() {
        Program4 obj = new Program4();
        System.out.println("This is the static method");
        System.out.println("Value of instance variable a is : "+obj.a);
        System.out.println("Value of instance variable b is : "+obj.b);
        System.out.println("Value of static variable firstName is : " +firstName);
        System.out.println("Value of static variable lastName is  : "+lastName);
    }

    // calling static and instance method
    public static void main(String[] args) {
        Program4 obj1 = new Program4();
        obj1.m1();
        m2();
    }
}
