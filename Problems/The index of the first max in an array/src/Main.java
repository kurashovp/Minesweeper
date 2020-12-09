import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intsLen = scanner.nextInt();
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intsLen; i++) {
            int n = scanner.nextInt();
            if (n > max) {
                max = n;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}