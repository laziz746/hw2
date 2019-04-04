import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
    public static void main(String[] args) {





        String[][] a = {
                {"1", "5", "8", "10"},
                {"3", "2", "11", "9"},
                {"0", "12", "3", "7"},
                {"13", "0", "8", "4"}
        };
        String[][] b = {
                {"3", "2", "3", "3"},
                {"8", "9"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] c = {
                {"3", "8", "3", "6"},
                {"5", "1", "}", "4"},
                {"0", "2", "9", "3"},
                {"9", "7", "7", "9"}
        };

        try {
            System.out.println(Converter.strConverter(a));
        } catch (Costom e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(b));
        } catch (Costom e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(c));
        } catch (Costom e) {
            System.err.println(e.getMessage());
        }
}
}