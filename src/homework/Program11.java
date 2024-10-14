package homework;

/**
 * Write a Java program to display the following pattern.
 * Sample Pattern :
 *  J a v v a
 *  J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a
 */
public class Program11 {

    // creating javaPrint method for printing java pattern
    public void javaPrint() {
        System.out.println("J   a  v   v  a");
        System.out.println("J  a a  v  v  a a");
        System.out.println("J J  aaaaa    V V aaaaa");
        System.out.println("J J  a   a   V  a   a");
    }

    // creating object and calling instace javaPrint method
    public static void main(String[] args) {
        Program11 obj = new Program11();
        obj.javaPrint();
    }
}


