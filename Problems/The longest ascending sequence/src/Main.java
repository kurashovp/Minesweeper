import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int maxSeq = 1;
        int current = 1;
        if (len == 1) {
            sc.nextInt();
            System.out.println(current);
        } else {
            int prev = sc.nextInt();
            for (int i = 1; i < len; i++) {
                int next = sc.nextInt();
                if (next > prev) {
                    if (++current > maxSeq) {
                        maxSeq = current;
                    }
                } else {
                    current = 1;
                }
                prev = next;
            }
            System.out.println(maxSeq);
        }
    }
}