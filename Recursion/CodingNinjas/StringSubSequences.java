import java.util.ArrayList;
import java.util.List;

public class StringSubSequences {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "xyz";
        printSubSequences(str,"");
        System.out.println(list);
        returnSubSequences(str,"");
        for(String i:list)
            System.out.println(i);
    }


    private static void returnSubSequences(String str,String ans) {
        if(str.isEmpty()) {
            list.add(ans);
            return;
        }

        returnSubSequences(str.substring(1),ans);
        returnSubSequences(str.substring(1),ans+str.charAt(0));
    }

    private static void printSubSequences(String str,String ans) {

        if(str.isEmpty()) {
           System.out.println(ans);
            return;
        }

        printSubSequences(str.substring(1),ans);
        printSubSequences(str.substring(1),ans+str.charAt(0));
    }
}
