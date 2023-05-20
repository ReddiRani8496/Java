import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpEx2{  
    public static void main(String args[]) {

        Pattern p = Pattern.compile(".r");// . represents single character 

        Matcher m = p.matcher("er");   

        boolean b = m.matches(); 
        System.out.println(b);  
  
        boolean b1 = Pattern.matches(".r", "ee");  // false, second character is not r
        System.out.println(b1);  

        boolean b2 = Pattern.matches(".r", "err"); // false, it has more than two characters
        System.out.println(b2);

        boolean b3 = Pattern.matches("[abc]","a"); // any one character among a,b,c
        System.out.println(b3);

        boolean b4 = Pattern.matches("[^abc]", "a"); // any character except a,b,c
        System.out.println(b4);

        boolean b5 = Pattern.matches("[a-zA-Z]", "r"); // a through z or A through Z, inclusive (range)
        System.out.println(b5);

        boolean b6 = Pattern.matches("[a-d[m-p]]","e"); // a through d, or m through p
        System.out.println(b6);

        boolean b7 = Pattern.matches("[a-z&&[def]]", "e"); // any one character among d,e,f
        System.out.println(b7);

        boolean b8 = Pattern.matches("[a-z&&[^bc]]", "b"); // any character from a through z except b and c
        System.out.println(b8);

        boolean b9 = Pattern.matches("x*", "xxx"); // x occurs zero or more times 
        System.out.println(b9);

        boolean b10 = Pattern.matches("j?..", "jab"); // j occurs once or not at all
        System.out.println(b10);

        boolean b11 = Pattern.matches("k+","kk"); // k occurs one or more times
        System.out.println(b11);

        boolean b12 = Pattern.matches("a{2}","aa"); // a occurs exactly n(2) times
        System.out.println(b12);

        boolean b13 = Pattern.matches("a{3,}","aaaa"); // a occurs n(3) times or more than n times
        System.out.println(b13);

        boolean b14 = Pattern.matches("a{3,6}","aaaaa"); // a occurs atleast n(3) times but less than m(6) times
        System.out.println(b14);
    }
}  
