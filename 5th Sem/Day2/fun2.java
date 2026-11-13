/* Write a function that returns the second last digit of the given number */
/* Test Case: 1234 -> 3 
Conditions:
1. The 2nd Last Digit Should be returned as a positive number
i.e: if the number is -197, second last digit is 9
2. If the number has only one digit, return -1 
*/
import java.util.Scanner;
public class fun2 {
    public static int secondLastDigit(int n) {
        n = Math.abs(n); // Ensure the number is positive
        if (n < 10) {
            return -1; // Return -1 if the number has only one digit
        }
        return (n / 10) % 10; // Extract the second last digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = secondLastDigit(n);
        System.out.println("Second Last Digit: " + result);
        sc.close();
    }
}