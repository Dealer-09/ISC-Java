/* Write a java program to check if a number is even or odd */
public class evenodd {
    public static void main(String[] args) 
    {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}