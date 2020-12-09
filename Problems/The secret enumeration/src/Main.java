public class Main {

    public static void main(String[] args) {
        int enumCount = 0;
        for (var enums : Secret.values()) {
            if (enums.name().startsWith("STAR")) {
                enumCount++;
            }
        }
        System.out.println(enumCount);
    }
}

/*
 At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
