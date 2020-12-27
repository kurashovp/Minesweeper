package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIDE = 9;
    static Cell[][] field = new Cell[SIDE][SIDE];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many mines do you want on the field? ");
        int mines = sc.nextInt();
        populateField();
        printField();
        play(mines);
    }

    private static void play(int mines) {
        boolean isInitialized = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Set/unset mine marks or claim a cell as free: ");
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            String command = sc.next();
            if (x >= 0 && x < SIDE && y >=0 && y < SIDE) {

                if ("mine".equals(command)) {
                    if (!field[y][x].isOpen()) {
                        field[y][x].toggleFlag();
                    }
                } else if ("free".equals(command)) {
                    if (!isInitialized) {
                        initializeField(mines, x, y);
                        isInitialized = true;
                    }
                    openCell(x, y);
                    if (field[y][x].isMine()) {
                        openAllMines();
                        printField();
                        System.out.println("You stepped on a mine and failed!");
                        break;
                    }
                }
            }
            printField();
            if (isAllCorrect()) {
                System.out.println("Congratulations! You found all the mines!");
                break;
            }

        }
    }

    private static void initializeField(int mines, int x, int y) {
        setMines(mines, x, y);
        countMines();
    }

    private static void openAllMines() {
        for (Cell[] cells: field){
            for (Cell cell: cells) {
                if (cell.isMine()) {
                    cell.setOpen();
                }
            }
        }
    }

    private static void openCell(int x, int y) {
        if (!field[y][x].isOpen()) {
            field[y][x].setOpen();
            if (field[y][x].isFlag()) {
                field[y][x].toggleFlag();
            }
            if (field[y][x].getValue() == 0) {
                for (int i = y - 1; i <= y + 1; i ++) {
                    for (int j = x - 1; j <= x + 1; j++) {
                        if (j < 0 || j > field.length - 1) continue;
                        if (i < 0 || i > field.length - 1) continue;
                        if (i == y && j == x) continue;
                        if (!field[i][j].isOpen()) {
                            openCell(j, i);
                        }
                    }
                }
            }
        }
    }

    private static boolean isAllCorrect() {
        boolean allMinesMarked = true;
        boolean allEmptyUnmarked = true;
        boolean allSafeOpened = true;
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                if (cell.isMine()) {
                    allMinesMarked &= cell.isFlag();
                } else {
                    allEmptyUnmarked &= !cell.isFlag();
                    allSafeOpened = allSafeOpened && cell.isOpen();
                }
            }
        }
        return (allMinesMarked && allEmptyUnmarked) || allSafeOpened;
    }

    private static void printField() {
        String header = " |123456789|";
        String hrLine = "-|---------|";
        System.out.println(header);
        System.out.println(hrLine);
        for (int y = 0; y < field.length; y++) {
            System.out.print((y + 1) + "|");
            for (int x = 0; x < field[y].length; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println("|");
        }
        System.out.println(hrLine);
    }

    static void populateField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell();
            }
        }
    }
    static void setMines(int mines, int x, int y) {
        Random rnd = new Random();
        int freeCell = y * SIDE + x;
        for (int i = 0; i < mines; i++) {
            int cell = rnd.nextInt(SIDE * SIDE);
            if (!field[cell / SIDE][cell % SIDE].isMine() && cell != freeCell) {
                field[cell / SIDE][cell % SIDE].setMine();
            } else {
                i--;
            }
        }
    }

    static void countMines() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field[y].length; x++) {
                int mineCount = 0;
                if (!field[y][x].isMine()) {
                    for (int i = y - 1; i <= y + 1; i ++) {
                        for (int j = x - 1; j <= x + 1; j++) {
                            if (j < 0 || j > field.length - 1) continue;
                            if (i < 0 || i > field.length - 1) continue;
                            if (i == y && j == x) continue;
                            if (field[i][j].isMine()) mineCount++;
                        }
                    }
                }
                field[y][x].setValue(mineCount);
            }
        }
    }
}
