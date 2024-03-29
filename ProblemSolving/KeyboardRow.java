import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();
        for(String word : words) {
            int[] rows = new int[3];
            for(char ch : word.toLowerCase().toCharArray()) {
                if(row1.indexOf(ch) != -1)
                    rows[0] = 1;
                else if(row2.indexOf(ch) != -1)
                    rows[1] = 1;
                else
                    rows[2] = 1;
            }   
            int sum = rows[0] + rows[1] + rows[2];
            if(sum == 1)
                result.add(word);
        }
        
        return result.toArray(new String[0]);
    }
}