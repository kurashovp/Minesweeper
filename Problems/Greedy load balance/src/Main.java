import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        LoadBalance q1 = new LoadBalance();
        LoadBalance q2 = new LoadBalance();
        Scanner scanner = new Scanner(System.in);
        int tasks = scanner.nextInt();

        for (int i = 0; i < tasks; i++) {
            int taskID = scanner.nextInt();
            int load = scanner.nextInt();
            if (q1.getLoad() <= q2.getLoad()) {
                q1.addTask(taskID, load);
            } else {
                q2.addTask(taskID, load);
            }
        }
        System.out.println(q1);
        System.out.println(q2);

    }
}

class LoadBalance {
    private final Queue<Integer> queue = new ArrayDeque<>();
    private int load = 0;

    public void addTask(int taskID, int load) {
        this.load += load;
        queue.offer(taskID);
    }

    public int getLoad() {
        return load;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        queue.forEach(i -> sb.append(i).append(" "));
        return sb.toString().trim();
    }
}