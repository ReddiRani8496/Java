import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegExpEx {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("java");

        Matcher m = p.matcher("java");

        System.out.println(m.matches());
        
        Matcher m1 = p.matcher("jav");

        System.out.println(m1.matches());
    }
}


