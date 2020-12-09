import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int lang = new Scanner(System.in).nextInt();
        System.out.println(lang == 1 ? "Yes!" : lang >= 2 && lang <= 4 ? "No!" : "Unknown number");
    }
}