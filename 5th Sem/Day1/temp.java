/* Write a program to covert the given temmperature in 
fahrenheit to celsius using fomula C/5 = (F-32)/9 */
public class temp {
    public static void main(String[] args) {
        if (args.length > 0) {
            double fahrenheit = Double.parseDouble(args[0]);
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Please provide the temperature");
        }
    }
}