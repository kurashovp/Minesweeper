import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(house2mean(new Scanner(System.in).next()));
    }

    static String house2mean(String house) {
        switch (house) {
            case "gryffindor": return "bravery";
            case "hufflepuff": return "loyalty";
            case "slytherin": return "cunning";
            case "ravenclaw": return "intellect";
            default: return "not a valid house";
        }
    }
}