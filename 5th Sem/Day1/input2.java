/*Write a java program to take two inputs 
(name and college name) through command line arguments
<name> is a BTECH student of <college name> college. 
*/
public class input2 {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String name = args[0];
            String college = args[1];
            System.out.println(name + " is a BTECH student of " + college + " college.");
        } else {
            System.out.println("Please provide name and college name as command line arguments.");
        }
    }
}