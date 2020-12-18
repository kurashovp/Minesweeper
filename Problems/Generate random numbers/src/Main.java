import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random rnd = new Random(a + b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += rnd.nextInt(b - a + 1) + a;
        }
        System.out.println(sum);
    }
}