import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] brackets = new Scanner(System.in).nextLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        boolean balanced = false;
        for (char bracket : brackets) {
            if (bracket == '(' ||
                    bracket == '[' ||
                    bracket == '{') {
                stack.push(bracket);
            } else if (!stack.isEmpty()) {
                char pop = stack.pop();
                switch (bracket) {
                    case ')':
                        balanced = pop == '(';
                        break;
                    case ']':
                        balanced = pop == '[';
                        break;
                    case '}':
                        balanced = pop == '{';
                        break;
                    default:
                        balanced = false;
                        break;
                }
                if (!balanced) {
                    break;
                }
            } else {
                balanced = false;
            }
        }

        System.out.println(balanced && stack.isEmpty());
    }
}