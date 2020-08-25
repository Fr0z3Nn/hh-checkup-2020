import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(conversion(line) ? "1" : "0");

    }

    public static boolean conversion(String line) {
        if (unilateralСonversion(line)) {
            return unilateralСonversion(new StringBuilder(line).reverse().toString());
        } else {
            return false;
        }

    }

    public static boolean unilateralСonversion(String fullLine) {

        String[] line = fullLine.split(" ");

        if (line[0].length() != line[1].length()) {
            return false;
        }
        if (line[0].equals(line[1])) {
            return true;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < line[0].length(); i++) {
            if (map.containsKey(line[0].charAt(i)) && map.get(line[0].charAt(i)) != line[1].charAt(i)) {
                return false;
            }

            if (!map.containsKey(line[0].charAt(i))) {
                map.put(line[0].charAt(i), line[1].charAt(i));
            }
        }

        return map.size() != 1 && map.size() <= 32;

    }
}
