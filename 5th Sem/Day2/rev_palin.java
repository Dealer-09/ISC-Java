/*reverse the digits of a given number abd add it to the original number until a palindrome is obtained 
also provide intermediate results
ex: Input: 174
Output: Intermediate result: 645
        Intermediate result: 1191
        Intermediate result: 3102
        Intermediate result: 5115 
        Final result: 5115 
Input: 123
Output: Intermediate result: 444
        Final result: 444*/
import java.util.Scanner;
public class rev_palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = num;
        while (!isPalindrome(result)) {
            int reversed = reverseNumber(result);
            result += reversed;
            System.out.println("Intermediate result: " + result);
        }
        System.out.println("Final result: " + result);
    }

    private static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}