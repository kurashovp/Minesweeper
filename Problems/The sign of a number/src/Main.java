import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        return  (number >> 31) | (-number >>> 31); // copy-paste Integer.signum()
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}