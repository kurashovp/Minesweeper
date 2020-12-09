import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sorted = true;
        int size = scanner.nextInt();
        if (size > 0) {
            int prev = scanner.nextInt();
            for (int i = 1; i < size && sorted; i++) {
                int next = scanner.nextInt();
                if (next < prev) {
                    sorted = false;
                } else {
                    prev = next;
                }
            }
        }
        System.out.println(sorted);
    }
}