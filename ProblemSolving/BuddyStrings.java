import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyStrings {
    boolean buddyStrings(String s, String goal) {

        if(s.length()!=goal.length()) 
            return false;

        if(s.equals(goal)) {
            HashSet<Character> hashSet = new HashSet<>();
            for(char c : s.toCharArray()) {
                hashSet.add(c);
            }
            if(hashSet.size()<s.length()) 
                return true;
            else
                return false;   
        }
        List<Integer> diff = new ArrayList();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }
        if(diff.size()==2 && 
            s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && 
            goal.charAt(diff.get(0)) ==  s.charAt(diff.get(1))) {
            return true;
        }

        else 
            return false;
    }
}
