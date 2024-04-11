import java.util.ArrayList;
import java.util.List;

public class ReturnAllCodes {
    public static void main(String[] args) {
        String str ="1123";
//        String[] output =printAllCodes(str);
//        for(String s:output)
//            System.out.print(s+" ");
        printCodes(str,"");
        System.out.println(list);
    }

    private static String[] printAllCodes(String str) {
        if(str.length()==0) {
            String[] output ={""};
            return output;
        }
        int firstDigit = str.charAt(0)-'0';
        String smallOutput1[] =printAllCodes(str.substring(1));
        String smallOutput2[] = new String[0];

        int firstTwoDigits = 0;
        if(str.length()>=2) {
            firstTwoDigits = (str.charAt(0)-'0')*10+(str.charAt(1)-'0');
            if(firstTwoDigits>=10 && firstTwoDigits<=26) {
                smallOutput2=printAllCodes(str.substring(2));
            }
        }
        String[] output = new String[smallOutput1.length+smallOutput2.length];
        int k=0;
        for(String s:smallOutput1) {
            char firstDigitChar = getChar(firstDigit);
            output[k++]=firstDigitChar+s;
        }
        for(String s:smallOutput2) {
            char firstTwoDigitChar = getChar(firstTwoDigits);
            output[k++] = firstTwoDigitChar+s;
        }
        return output;
    }
    private static char getChar(int n) {
        return (char)(96+n);
    }
    static List<String> list=new ArrayList<>();
    private static void printCodes(String str, String ans) {
        if(str.length()==0) {
           // System.out.println(ans);
            list.add(ans);
            return;
        }
        int firstDigit=str.charAt(0)-'0';
        printCodes(str.substring(1),ans+getChar(firstDigit));
        if(str.length()>1)  {
            int twoDigits = (str.charAt(0)-'0')*10+str.charAt(1)-'0';
            if(twoDigits>=10 && twoDigits<=26)
                printCodes(str.substring(2),ans+getChar(twoDigits));
        }

    }
}
