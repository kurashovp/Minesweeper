import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String input;
        while (!(input = reader.readLine()).equals("end")) {
            strings.add(input);
        }
        int m = strings.size();
        int n = strings.get(0).split("\\s+").length;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(strings.get(i).split("\\s+")[j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[(i - 1 + m) % m][j] + matrix[(i + 1) % m][j] +
                        matrix[i][(j - 1 + n) % n] + matrix[i][(j + 1) % n] + " ");
            }
            System.out.println();
        }
    }
}