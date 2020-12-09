import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int j : arr) {
            if (j > n) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}