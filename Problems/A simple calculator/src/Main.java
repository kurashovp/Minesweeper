import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        long firstNum = Long.parseLong(input[0]);
        long secondNum = Long.parseLong(input[2]);
        String op = input[1];

        switch (op) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}