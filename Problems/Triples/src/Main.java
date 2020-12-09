import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int triple = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i > 1 && arr[i] - 1 == arr[i - 1] && arr[i] - 2 == arr[i - 2]) {
                triple++;
            }
        }
        System.out.println(triple);
        Long val = new Long(10);
    }
}