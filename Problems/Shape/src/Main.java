import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    enum Shapes {
        UNDEF("There is no such shape!"),
        SQUARE("square"),
        CIRCLE("circle"),
        TRIANGLE("triangle"),
        RHOMBUS("rhombus");

        String shapeName;
        Shapes(String s) {
            shapeName = s;
        }

        @Override
        public String toString() {
            return String.format("You have chosen a %s", this.shapeName);
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int shapeNum = 0;
        try {
            shapeNum = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (shapeNum < 1 || shapeNum > 4) {
            System.out.println("There is no such shape!");
        } else {
            System.out.println(Shapes.values()[shapeNum]);
        }
    }
}