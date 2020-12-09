import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger result = (n == 0) ? BigInteger.ONE : BigInteger.valueOf(n);
        for (n -= 2; n > 0; n -= 2) {
            result = result.multiply(BigInteger.valueOf(n));
        }
        return result;
    }
}