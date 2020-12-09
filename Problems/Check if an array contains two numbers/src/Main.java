import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(reader.readLine())];
        String[] arrElements = reader.readLine().split("\\s+");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrElements[i]);
        }
        String[] mn = reader.readLine().split("\\s");
        int n = Integer.parseInt(mn[0]);
        int m = Integer.parseInt(mn[1]);
        boolean contain = false;
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == n && array[i + 1] == m ||
                    array[i] == m && array[i + 1] == n) {
                    contain = true;
                    break;
                }
            }
        }
        System.out.println(contain);
    }
}