package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int SIDE = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many mines do you want on the field? ");
        int mines = sc.nextInt();
        Cell[][] mineField = new Cell[SIDE][SIDE];
        populateField(mineField, mines);
        countMines(mineField);
        printField(mineField);
        play(mineField);
    }

    private static void play(Cell[][] field) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Set/delete mine marks (x and y coordinates): ");
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x >= 0 && x < SIDE && y >=0 && y < SIDE) {
                if (field[y][x].getValue() == 0) {
                    field[y][x].toggleFlag();
                } else {
                    System.out.println("There is a number here!");
                    continue;
                }
            }
            printField(field);
            if (isAllCorrect(field)) {
                System.out.println("Congratulations! You found all the mines!");
                break;
            }

        }
    }

    private static boolean isAllCorrect(Cell[][] field) {
        boolean allMinesMarked = true;
        boolean allEmptyUnmarked = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].isMine()) {
                    allMinesMarked &= field[i][j].isFlag();
                } else {
                    allEmptyUnmarked &= !field[i][j].isFlag();
                }
            }
        }
        return allMinesMarked && allEmptyUnmarked;
    }

    private static void printField(Cell[][] field) {
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

    static void populateField(Cell[][] field, int mines) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell();
            }
        }
        Random rnd = new Random();
        for (int i = 0; i < mines; i++) {
            int cell = rnd.nextInt(SIDE * SIDE);
            if (!field[cell / SIDE][cell % SIDE].isMine()) {
                field[cell / SIDE][cell % SIDE].setMine();
            } else {
                i--;
            }
        }
    }

    static void countMines(Cell[][] field) {
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
