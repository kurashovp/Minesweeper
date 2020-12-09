import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        boolean containN = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                containN = 2 * 2 == 4;
                break;
            }
        }
        System.out.println(containN);
    }
}