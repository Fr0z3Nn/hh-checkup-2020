import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(conversion(line) ? 1 : 0);

    }

    public static boolean conversion(String fullLine) {

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

            map.put(line[0].charAt(i), line[1].charAt(i));

        }

        int haveDuplicates = 33;

        HashMap<Character, Character> copy = new HashMap<>(map);

        for(Map.Entry<Character,Character> pair : map.entrySet()){
            copy.remove(pair.getKey(),pair.getValue());
            if(copy.containsKey(pair.getValue())){
                haveDuplicates = 32;
                copy.remove(pair.getValue());
            }
        }

        return map.size() <= haveDuplicates;

    }
}
