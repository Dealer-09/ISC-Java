/* Program To Find ASCII Value of a Character */
public class ascii {
    public static void main(String[] args) {
        if (args.length > 0) {
            char ch = args[0].charAt(0);
            int ascii = (int) ch;
            System.out.println("Character: " + ch);
            System.out.println("ASCII Value: " + ascii);
        } else {
            System.out.println("Please provide a character.");
        }
    }
}