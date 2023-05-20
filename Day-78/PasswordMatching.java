import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatching {
    public static void main(String[] args) {

        Pattern p1 = Pattern.compile("........*");

        Matcher password = p1.matcher("kinjklmn");

        if(password.matches()) {

            System.out.println("Strong enough password");

        }
        else {

            System.out.println("It should be atleast eight characters");

        }

        Matcher password1 = p1.matcher("abcdefghij");

        if(password1.matches()) {

            System.out.println("Strong enough password");
        }
        else {
            
            System.out.println("It should be atleast eight characters");
        }

  
    }
}
