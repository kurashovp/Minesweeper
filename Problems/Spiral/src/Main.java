class Main {
    public static void main(String[] args) {

        int n = new java.util.Scanner(System.in).nextInt();
        int m = n;
        int[][] mtx = new int[n][m];
        int rawX0 = 0;
        int colY0 = 0;
        int rawXX = n;
        int colYY = m;
        int k;
        for (k = 1; k <= n * m;) {
            k = fillSpiral(mtx, k, n * m, rawX0, colY0, rawXX, colYY);
            rawX0++;
            colY0++;
            rawXX--;
            colYY--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int fillSpiral(int[][] mtx, int n, int maxK, int rawX0, int colY0, int rawXX, int colYY) {
        int k = n;
        for (int i = colY0; i < colYY && k <= maxK; i++) {
            mtx[rawX0][i] = k++;
        }
        for (int i = rawX0 + 1; i < rawXX && k <= maxK; i++) {
            mtx[i][colYY - 1] = k++;
        }
        for (int i = colYY - 2; i >= colY0 && k <= maxK; i--) {
            mtx[rawXX - 1][i] = k++;
        }
        for (int i = rawXX - 2; i > rawX0 && k <= maxK; i--) {
            mtx[i][rawX0] = k++;
        }
        return k;
    }
}