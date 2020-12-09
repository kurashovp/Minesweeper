//put imports you need here

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static final String FORM_FORMAT = "The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        reader.readLine();
        reader.readLine();
        reader.readLine();
        String cuisinePref = reader.readLine();
        System.out.printf(FORM_FORMAT, firstName, cuisinePref);
    }
}