/* Program to reverse a number */
public class rev {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            int reversed = 0;
            while (num != 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Please provide a number.");
        }
    }
}