/*Write a program to read  the price of an item in the deciimal form 
(like 175.95) and print the output in paise (like 17595)*/
import java.util.Scanner;
public class deci {
    public static void main(String[] args) {
        double price;

        if (args.length > 0) {
            price = Double.parseDouble(args[0]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter price of the item: ");
            price = sc.nextDouble();
            sc.close();
        }
        int paise = (int) Math.round(price * 100);

        System.out.println("Price in paise: " + paise);
    }
}
