/* Program to convert long to int */
public class convert {
    public static void main(String[] args) {
        if (args.length > 0) {
            long num = Long.parseLong(args[0]);
            int result = (int) num;
            System.out.println("Long value: " + num);
            System.out.println("Int value: " + result);
        } else {
            System.out.println("Please provide a long value.");
        }
    }
}