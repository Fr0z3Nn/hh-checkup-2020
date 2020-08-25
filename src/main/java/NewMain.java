import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        //System.out.println(conversion(line) ? 1 : 0);
        System.out.println(conversion(line));
    }
    public static boolean conversion(String fullLine) {
        String[] line = fullLine.split(" ");
        String str1 = line[0];
        String str2 = line[1];
        Character[] alphabet = new Character[]{
              'й','ц','у','к','е','н','г','ш','щ','з','х','ъ','ф','ы','в','а','п','р','о','л','д','ж','э','я','ч','с','м','и','т','ь','б','ю','ё'
        };
        if (str1.length() != str2.length()) {
            return false;
        }
        boolean have = true;
        for (int i = 0; i < line[0].length() - 1; i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                if(str2.contains(String.valueOf(str1.charAt(i)))){
                    for(int j = 0; j < alphabet.length - 1;j++){
                        if(!str1.contains(String.valueOf(alphabet[j])) && !str2.contains(String.valueOf(alphabet[j]))){
                            str2 = str2.replace(str2.charAt(i),alphabet[j]);
                            System.out.println(str2);
                            break;

                        }
                        if( j == alphabet.length - 1){
                            have = false;
                        }
                    }
                }else{
                    str2 = str2.replace(str2.charAt(i),str1.charAt(i));
                    System.out.println(str2);
                }
            }
        }
        return have;

    }
}
