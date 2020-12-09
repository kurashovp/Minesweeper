import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        System.out.println(a.negate().multiply(b).add(c).subtract(d));
    }
}