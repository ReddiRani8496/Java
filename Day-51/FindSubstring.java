public class FindSubstring {
    public static void main(String[] args) {
        String str="hi how are you";
        String sub="you";
        for(int i=0;i<(str.length()-sub.length());i++){
            int j;
            for(j=0;j<str.length();j++){
                if(str.charAt(i+j)!=sub.charAt(j)){
                    break;
                }
            }
            if(j==str.length())
                 System.out.println(i);
        }
        System.out.println(str.length());
        
    }
}
