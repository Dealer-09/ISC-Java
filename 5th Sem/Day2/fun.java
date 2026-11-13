/*Perform a Mathematical Operation using loops
Ask the user for a number and then apply the following 
operation until the result becomes a single digit number 
Multiply Each digit of the number and repeat the process. 
Output Each Intermediate Result*/

/* Test Case:
Input: 721
Intermediate Result: 14
Intermediate Result: 4
Final Result: 4

Input: 123
Intermediate Result: 6
Final Result: 6
*/

import java.util.Scanner;
public class fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n;
        }
        int result = n;

        while (result >= 10) {
            int product = 1;
            int temp = result;

            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }
            result = product;
            System.out.println("Intermediate Result: " + result);
        }
        System.out.println("Final Result: " + result);
        sc.close();
    }
}


