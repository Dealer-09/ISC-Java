/*Write a java program to print Collatz sequence
if number is even, then n=n/2, if number is odd, then n=3*n+1, repeat untill it becomes 1
Test Case: 
Input: 3 Output: 3 10 5 16 8 4 2 1
Input: 6 Output: 6 3 10 5 16 8 4 2 1
Input: -6 Output: ERROR*/
import java.util.Scanner;
public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("ERROR");
        } else {
            System.out.print("Collatz sequence: ");
            while (n != 1) {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            }
            System.out.println(n); // Print the last number which is 1
        }
        sc.close();
    }
}