public class RepeatedSubstring {
    boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = n/2; i >= 1; i--) {
            if(n%i == 0) {
                String str = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                sb.append(str.repeat(n / i));
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}
