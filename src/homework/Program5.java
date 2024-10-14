package homework;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    // creating instance addition method with parameter
    public int addition(int a, int b) {
        int result = a+b;
        System.out.println("Addition of "+a+" and "+b+" is "+result);
        return result;
    }

    // creating instance substraction method with parameter
    public int substraction(int a, int b) {
        int result = a-b;
        System.out.println("Substraction of "+a+" and "+b+" is "+result);
        return result;
    }

    // creating static multiplication method with parameter
    public static int multiplication(int a, int b) {
        int result = a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+result);
        return result;
    }

    // creating static division method with parameter
    public static int division(int a, int b) {
        int result = a/b;
        System.out.println("Division of "+a+" and "+b+" is "+result);
        return result;
    }

    // calling all methods using parameters
    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.addition(20,3);
        obj.substraction(5,2);
        multiplication(5,10);
        division(10,2);
    }
}
