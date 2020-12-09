package minesweeper;

public class Cell {
    private boolean isMine = false;
    private boolean isFlag = false;
    private int value = 0;

    public int getValue() {
        return value;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine() {
        isMine = true;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void toggleFlag() {
        isFlag = !isFlag;
    }

    @Override
    public String toString() {
        if (isFlag) return "*";
        if (isMine) return "."; //"X";
        return value == 0 ? "." : String.valueOf(value); // "¤" : "░")
    }
}
