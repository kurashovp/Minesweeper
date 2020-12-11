//put imports you need here

import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Deque<String> guests = new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
            String[] room = scanner.nextLine().split("\\s+");
            for (String s : room) {
                guests.addFirst(s);
            }
        }
        while (!guests.isEmpty()) {
            System.out.println(guests.pollFirst());
        }
    }
}