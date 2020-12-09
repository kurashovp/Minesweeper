import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
//        BigInteger m = new Scanner(System.in).nextBigInteger();
        BigInteger m = BigInteger.valueOf(Long.MAX_VALUE);
        int n = 0;
        BigInteger nf = BigInteger.ONE;
        while (nf.compareTo(m) < 0) {
            n++;
            nf = nf.multiply(BigInteger.valueOf(n));
        }
        System.out.println("max long = " + m);
        System.out.println("n! = " + nf);
        System.out.println(n);
    }
}