import java.util.ArrayList;
import java.util.List;

public class ShortestDistToChar {
        int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        int len = s.length();
        list.add(-1000);

        for(int i=0;i<len;i++) {
            if(s.charAt(i)==c)
                list.add(i);
        }

        list.add(Integer.MAX_VALUE);

        int[] result = new int[len];

        int first = list.get(0);
        int second = list.get(1);
        int k=2;

        for(int i=0;i<len;i++) {
            if(s.charAt(i)!=c) {
                result[i] = Math.min(i-first,second-i);
            } else {
                first = second;
                second = list.get(k++);
            }
        }
        return result;
    }
}
