public class CountAndSay {
    String countAndSay(int n) {
        String val = "1";
        for(int i = 0; i < n-1; i++){
            char c = val.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j = 1; j < val.length(); j++){
                if(c != val.charAt(j)){
                    sb.append(count);
                    sb.append(c);
                    count = 0;
                    c = val.charAt(j);
                }
                count++;
            }
            sb.append(count);
            sb.append(c);
            val = sb.toString();
        }
        return val;
    }
}
