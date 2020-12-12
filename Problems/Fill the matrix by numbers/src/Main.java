class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(i - j) + " ");
            }
            System.out.println();
        }
    }
}