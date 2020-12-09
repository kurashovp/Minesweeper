import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class Main {
    static Deque<Integer> mainStack = new ArrayDeque<>();
    static Deque<Integer> trackStack = new ArrayDeque<>();
    static Queue<String> s = new ArrayDeque<>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cmdCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < cmdCount; i++) {
            String command = reader.readLine();
            switch (command.split("\\s+")[0]) {
                case "push":
                    doPush(Integer.parseInt(command.split("\\s+")[1]));
                    break;
                case "pop":
                    doPop();
                    break;
                case "max":
                    doMax();
                    break;
                default:
                    break;
            }
        }
    }

    private static void doPush(int element) {
        if (!mainStack.isEmpty()) {
            mainStack.push(element);
            if (element > trackStack.peek()) {
                trackStack.push(element);
            } else {
                trackStack.push(trackStack.peek());
            }
        } else {
            mainStack.push(element);
            trackStack.push(element);
            mainStack.pollLast(element)
        }


    }

    private static void doPop() {
        mainStack.pop();
        trackStack.pop();
    }

    private static void doMax() {
        System.out.println(trackStack.peek());
    }
}