/* Program to check if a number is a perfect number */
public class perfect {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            } else {
                System.out.println(num + " is not a perfect number.");
            }
        } else {
            System.out.println("Please provide a number.");
        }
    }
}