import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(isConvertible(line) ? 1 : 0);
    }

    public static boolean isConvertible(String line) {
        String[] lines = line.split(" ");
        String firstLine = lines[0];
        String secondLine = lines[1];

        if (firstLine.length()==secondLine.length()) {

            if(firstLine.equals(secondLine)){
                return true;
            }

            Map<Character, Character> map = new HashMap<>();

            for (int i = 0; i < firstLine.length(); i++) {
                if (map.containsKey(firstLine.charAt(i))&&( map.get(firstLine.charAt(i)) != secondLine.charAt(i)) ) {
                    return false;
                } else {
                    map.put(firstLine.charAt(i), secondLine.charAt(i));
                }
            }
            return numberOfSymbols(secondLine) < 33;
        }
        return false;
    }

    private static int numberOfSymbols(String line) {
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<line.length();i++) {
            set.add(line.charAt(i));
        }
        return set.size();
    }
}