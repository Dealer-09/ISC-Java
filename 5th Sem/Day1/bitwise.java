/* Program to swap two numbers using bitwise operations */
public class bitwise {
    public static void main(String[] args) {
        if (args.length >= 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        } else {
            System.out.println("Please provide two numbers.");
        }
    }
}