import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = reader.readLine().split("\\s+");
        int rotate = Integer.parseInt(reader.readLine());
        rotate %= array.length;
        for (int i = array.length - rotate; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        for (int i = 0; i < array.length - rotate; i++) {
            System.out.printf("%s ", array[i]);
        }
    }
}