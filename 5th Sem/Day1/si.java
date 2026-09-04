/* Program to calculate simple interest (si)
while your input are principal (P), rate of interest (R), time in years (T) */
public class si {
    public static void main(String[] args) {
        if (args.length >= 3) {
            double p = Double.parseDouble(args[0]);
            double r = Double.parseDouble(args[1]);
            double t = Double.parseDouble(args[2]);
            double si = (p * r * t) / 100;
            System.out.println("Simple Interest: " + si);
        } else {
            System.out.println("Please provide principal, rate, and time.");
        }
    }
}