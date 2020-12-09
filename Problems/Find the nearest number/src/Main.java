import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int num = scanner.nextInt();
        int[] array = new int[input.length];
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
            int abs = Math.abs(array[i] - num);
            if (abs < distance) {
                distance = abs;
            }
        }

        final int fd = distance;
        Arrays.stream(array).filter(n -> Math.abs(num - n) == fd).sorted().forEach(n -> System.out.print(n + " "));
    }
}