/* Program to check if a number is a palindrome */
public class palindrome {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            int og = num;
            int spoof = 0;
            while (num != 0) {
                int digit = num % 10;
                spoof = spoof * 10 + digit;
                num /= 10;
            }
            if (og == spoof) {
                System.out.println(og + " is a palindrome.");
            } else {
                System.out.println(og + " is not a palindrome.");
            }
        } else {
            System.out.println("Please provide a number.");
        }
    }
}
