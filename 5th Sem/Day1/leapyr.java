/* Write a java program to check if a year is a leap year or not */
public class leapyr {
    public static void main(String[] args) {
        if (args.length > 0) {
            int year = Integer.parseInt(args[0]);
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Please provide a year as a command line argument.");
        }
    }
}