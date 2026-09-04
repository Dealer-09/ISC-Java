/* Program to find the sum of n natural numbers */
public class sum {
    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        } else {
            System.out.println("Please provide a number.");
        }
    }
}