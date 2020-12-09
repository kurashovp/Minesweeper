import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];

        for (int col = 0; col < matrix.length; col++) {
            for (int raw = 0; raw < matrix[col].length; raw++) {
                matrix[col][raw] = scanner.nextInt();
            }
        }
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        if (c1 != c2) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c1] ^= matrix[i][c2];
                matrix[i][c2] ^= matrix[i][c1];
                matrix[i][c1] ^= matrix[i][c2];
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }

    }
}