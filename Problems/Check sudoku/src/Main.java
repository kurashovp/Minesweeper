import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * n;
        boolean isSolved = true;
        int[][] sudoku = new int[size][size];
        for (int i = 0; i < size * size; i++) {
            sudoku[i / size][i % size] = sc.nextInt();
            if (sudoku[i / size][i % size] < 1 || sudoku[i / size][i % size] > size) {
                isSolved = false;
            }
        }
        if (isSolved) {
            isSolved = checkSudoku(sudoku, n);
        }

        System.out.println(isSolved ? "YES" : "NO");
    }

    private static boolean checkSudoku(int[][] sudoku, int n) {
        int size = sudoku.length;
        boolean isSolved = false;
        boolean[][][] smallSquares = new boolean[n][n][size];
        for (int i = 0; i < sudoku.length; i++) {
            boolean[] rowBits = new boolean[size];
            boolean[] colBits = new boolean[size];
            for (int j = 0; j < sudoku[i].length; j++) {
                rowBits[sudoku[i][j] - 1] = true;
                colBits[sudoku[j][i] - 1] = true;
                smallSquares[i / n][j / n][sudoku[i][j] - 1] = true;
            }
            if (!(isSolved = isAllBits(rowBits) && isAllBits(colBits))) {
                break;
            }
        }
        if (isSolved) {
            for (int i = 0; i < n * n; i++) {
                if (!(isSolved = isAllBits(smallSquares[i / n][i % n]))) {
                    break;
                }
            }
        }
        return isSolved;
    }

    private static boolean isAllBits(boolean[] bits) {
        boolean isAll = true;
        for (boolean bit : bits) {
            isAll &= bit;
        }
        return isAll;
    }
}