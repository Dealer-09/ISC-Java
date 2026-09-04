import java.util.Scanner;

class PrimeAdam {
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return rev;
    }

    static boolean isAdam(int num) {
        int sqNum = num * num;
        int revNum = reverse(num);
        int sqRevNum = revNum * revNum;
        int rev = reverse(sqNum);
        return rev == sqRevNum;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        in.close();

        if (m >= n) {
            System.out.println("INVALID INPUT");
            return;
        }

        int count = 0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for (int i = m; i <= n; i++) {
            if (isAdam(i) && isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.print("NIL");
        }

        System.out.println();
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}
