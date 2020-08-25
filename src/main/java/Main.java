import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(conversion(line)?"1":"0");

    }

    public static boolean conversion(String line){
        if(unilateralСonversion(line)){
            return unilateralСonversion(new StringBuilder(line).reverse().toString());
        }else{
            return false;
        }

    }

    public static boolean unilateralСonversion(String fullLine){
        int count = 33;
        String[] line = fullLine.split(" ");
        if(line[0].length() != line[1].length()){
            return false;
        }
        if(line[0].equals(line[1])){
            return true;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < line[0].length(); i++){
            if(map.containsKey(line[0].charAt(i)) && map.get(line[0].charAt(i)) != line[1].charAt(i)){
                return false;
            }

            if(!map.containsKey(line[0].charAt(i))){
                map.put(line[0].charAt(i),line[1].charAt(i));
                count--;
            }
        }

        if(map.size() == 1){
            return false;
        }

        HashMap<Character, Character> copy = new HashMap<>(map);

        for(Map.Entry<Character,Character> pair : copy.entrySet()){
            Character key = pair.getKey();
            Character value = pair.getValue();
            map.remove(key,value);
            if(map.containsKey(value)){
                count--;
                map.remove(value);
            }
        }

        return count >= 0;
    }
}
