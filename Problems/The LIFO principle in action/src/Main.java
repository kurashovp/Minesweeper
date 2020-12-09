import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int numElement = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numElement; i++) {
            deque.offerLast(Integer.parseInt(reader.readLine()));
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
    }
}