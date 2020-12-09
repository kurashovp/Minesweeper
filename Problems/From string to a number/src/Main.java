import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(str2num(new Scanner(System.in).next()));
    }

    static int str2num(String num) {
        switch (num) {
            case "one": return 1;
            case "two": return 2;
            case "three": return 3;
            case "four": return 4;
            case "five": return 5;
            case "six": return 6;
            case "seven": return 7;
            case "eight": return 8;
            case "nine": return 9;
            default: return 0;
        }
    }
}