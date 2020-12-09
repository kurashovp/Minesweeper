import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            int elem = Integer.parseInt(reader.readLine());
            if (elem % 2 == 0) {
                deque.offerFirst(elem);
            } else {
                deque.offerLast(elem);
            }
        }

        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
    }
}