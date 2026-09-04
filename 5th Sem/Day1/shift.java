/* Program to multiply a number by 2 and divide the same number 4 using left shift */
public class shift {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            int multiply = num << 1;
            int divide = num >> 2;
            System.out.println("Number: " + num);
            System.out.println("After Multiplying by 2: " + multiply);
            System.out.println("After dividing by 4: " + divide);
        } else {
            System.out.println("Please provide a number.");
        }
    }
}