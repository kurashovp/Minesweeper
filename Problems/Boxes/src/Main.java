import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] boxFit = {"Box 1 < Box 2", "Incompatible", "Box 1 > Box 2"};
        Scanner scanner = new Scanner(System.in);
        Box box1 = new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Box box2 = new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(boxFit[box1.compareTo(box2) + 1]);
    }


}

class Box implements Comparable<Box> {
    int x, y, z;

    public Box(int x, int y, int z) {
        this.x = min(min(x, y), z);
        this.z = max(max(x, y), z);
        this.y = (x + y + z) - this.x - this.z;
    }

    @Override
    public int compareTo(Box o) {
        if (this.x > o.x && this.y > o.y && this.z > o.z) {
            return 1;
        } else if (this.x < o.x && this.y < o.y && this.z < o.z) {
            return -1;
        } else {
            return 0;
        }
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

}