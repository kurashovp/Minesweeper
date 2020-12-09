import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        if (m == 0) {
            return 1L;
        }
        int p = m;
        long x = n;
        long y = 1;
        while (p > 1) {
            if (p % 2 == 0) {
                x = x * x;
                p /= 2;
            } else {
                y = x * y;
                x = x * x;
                p = p / 2;
            }
        }
        return x * y;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}