import java.util.*;

public class QuadraticSolver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Solving a quadratic equation of the form ax² + bx + c = 0");

    // Taking user input
    System.out.print("Enter the coefficient a: ");
    double a = sc.nextDouble();
    System.out.print("Enter the coefficient b: ");
    double b = sc.nextDouble();
    System.out.print("Enter the coefficient c: ");
    double c = sc.nextDouble();

    // Check if it's a quadratic equation
    if (a == 0) {
      System.out.println("Error! 'a' cannot be zero. Not a quadratic equation.");
    } else {
      double d = b * b - 4 * a * c; // Compute the discriminant

      if (d > 0) {
        // Two distinct real roots
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("\nThe two distinct real roots are:");
        System.out.printf("Root 1: %.2f\n", root1);
        System.out.printf("Root 2: %.2f\n", root2);

      } else if (d == 0) {
        // One real root
        double root = -b / (2 * a);
        System.out.printf("\nThe quadratic equation has one real root: %.2f\n", root);

      } else {
        // Two complex roots
        double real = -b / (2 * a);
        double imag = Math.sqrt(-d) / (2 * a);
        System.out.println("\nThe two complex roots are:");
        System.out.printf("Root 1: %.2f + %.2fi\n", real, imag);
        System.out.printf("Root 2: %.2f - %.2fi\n", real, imag);
      }
    }
    sc.close();
  }
}
