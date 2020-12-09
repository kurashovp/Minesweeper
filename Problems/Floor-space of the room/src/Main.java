import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String shape = reader.readLine();
        switch (shape) {
            case "triangle":
                triangle(reader);
                break;
            case "rectangle":
                rectangle(reader);
                break;
            case "circle":
                circle(reader);
                break;
            default:
        }
    }

    private static void triangle(BufferedReader reader) throws IOException {
        double a;
        double b;
        double c;
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
    private static void rectangle(BufferedReader reader) throws IOException {
        double a;
        double b;
        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        double area = a * b;
        System.out.println(area);
    }
    private static void circle(BufferedReader reader) throws IOException {
        double r;
        double pi = 3.14;
        r = Double.parseDouble(reader.readLine());
        double area = pi * r * r;
        System.out.println(area);
    }
}
