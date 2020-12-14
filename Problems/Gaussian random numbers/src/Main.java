import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seed = scanner.nextInt();
        Random rnd = new Random(seed);
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        while (true) {
            boolean allGauss = true;
            for (int i = 0; allGauss && i < n; i++) {
                allGauss = rnd.nextGaussian() <= m;
            }
            if (allGauss) {
                break;
            }
            rnd.setSeed(++seed);
        }
        System.out.println(seed);
    }
}