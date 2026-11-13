/* Convert a binary number to octal Number */

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int len = binary.length();
        int pad = (3 - (len % 3)) % 3;

        if (pad != 0) {
            binary = "0".repeat(pad) + binary;
        }

        StringBuilder octal = new StringBuilder();

        for (int i = 0; i < binary.length(); i += 3) {
            String group = binary.substring(i, i + 3);
            int value = Integer.parseInt(group, 2);
            octal.append(value);
        }

        System.out.println("Octal number: " + octal);
        sc.close();
    }
}