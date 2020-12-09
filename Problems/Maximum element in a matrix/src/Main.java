import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raw = scanner.nextInt();
        int col = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < raw * col; i++) {
            int element = scanner.nextInt();
            if (element > max) {
                max = element;
                maxIndex = i;
            }
        }
        System.out.printf("%d %d\n", maxIndex / col, maxIndex % col);
    }
}