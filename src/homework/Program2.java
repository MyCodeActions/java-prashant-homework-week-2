package homework;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
public class Program2 {

    // Declaring two static variable
    static int a = 50;
    static int b = 100;

    // creating m1 static method & calling both static variable inside
    public static void m1() {
        System.out.println("This is static method");
        System.out.println("Value of static variable a is : " + a);
        System.out.println("Value of static variable b is : " + b);
    }

    // calling m1 method
    public static void main(String[] args) {
        m1();
    }
}
