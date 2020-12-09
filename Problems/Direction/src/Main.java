import java.util.Scanner;

class Main {
    enum Moves {
        DO_NOT("do not move"),
        UP("move up"),
        DOWN("move down"),
        LEFT("move left"),
        RIGHT("move right"),
        ERROR("error!");


        private String text;

        Moves(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input >= 0 && input <=  4) {
            System.out.println(Moves.values()[input]);
        } else {
            System.out.println(Moves.ERROR);
        }
    }
}