import java.util.*;

class CPSP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Coefficients for f(x,y) = ax^2 + by^2+ cxy+ dx +ey +f");
    System.out.println("a= ");
    int a = sc.nextInt();
    System.out.println("b= ");
    int b = sc.nextInt();
    System.out.println("c= ");
    int c = sc.nextInt();
    System.out.println("d= ");
    int d = sc.nextInt();
    System.out.println("e= ");
    int e = sc.nextInt();
    System.out.println("f= ");
    int constant = sc.nextInt();
    Function2D function = new Function2D(a, b, c, d, e, constant);
    function.findCriticalPoints();
  }
}

class Function2D {
  private int a, b, c, d, e, constant;

  Function2D(int a, int b, int c, int d, int e, int constant) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.constant = constant;
  }

  public void findCriticalPoints() {
    int determinant = 4 * a * b - c * c;
    if (determinant == 0) {
      System.out.println("No unique critical points (determinant = 0).");
      return;
    }
    int xCritical = (c * e - 2 * b * d) / determinant;
    int yCritical = (c * d - 2 * a * e) / determinant;

    System.out.println("Critical Point: (" + xCritical + ", " + yCritical + ")");
    classifyPoint(xCritical, yCritical);
  }

  // Calculation For Critical Points
  private void classifyPoint(double x, double y) {
    // Second derivatives
    int f_xx = 2 * a;
    int f_yy = 2 * b;
    int f_xy = c;
    int hessian = f_xx * f_yy - f_xy * f_xy; // Hessian

    if (hessian > 0 && f_xx > 0) {
      System.out.println("Point (" + x + ", " + y + ") is a Local Minimum.");
    } else if (hessian > 0 && f_xx < 0) {
      System.out.println("Point (" + x + ", " + y + ") is a Local Maximum.");
    } else if (hessian < 0) {
      System.out.println("Point (" + x + ", " + y + ") is a Saddle Point.");
    } else {
      System.out.println("Point (" + x + ", " + y + ") is Indeterminate.");
    }
  }
}
