/*Write a java program to print your college name 
by taking input through command line arguments*/
class Input1 {
    static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("College Name: " + args[0]);
        } else {
            System.out.println("Please provide the college name as a command line argument.");
        }
    }
}