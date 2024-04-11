import java.util.ArrayList;
import java.util.List;

class Main {
    static List<List<String>> lists = new ArrayList<>();

    public static void main(String[] args) {
        String str ="1123";
       // returnAllCodes(str,0,"");

        returnAllCodes(str,"");
        for(List<String> list:lists) {
            System.out.println(list);
        }
    }

    private static void returnAllCodes(String str,  String ans) {
        if(str.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(ans);

            lists.add(list);

            return;
        }

        int firstDigit = str.charAt(0)-'0';
        returnAllCodes(str.substring(1),ans+getChar(firstDigit));

        if(str.length()>1) {

            int twoDigits = (str.charAt(0)-'0')*10+str.charAt(1)-'0';

            if(twoDigits>=10 && twoDigits<=26)
                returnAllCodes(str.substring(2),ans+getChar(twoDigits));

        }
    }
    private static char getChar(int n) {
        return (char)(96+n);
    }
}