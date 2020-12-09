import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (min > m) {
                min = m;
            }
        }
        System.out.println(min);
    }
}