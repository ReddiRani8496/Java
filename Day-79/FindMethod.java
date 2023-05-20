
// program to illustrate find() method
  
import java.util.regex.*;
  
public class FindMethod {
    public static void main(String[] args)
    {
  
        String regex = "\\d\\s\\d";

        Pattern pattern = Pattern.compile(regex);

        String stringToBeMatched = "8 9098";
  
        Matcher matcher = pattern.matcher(stringToBeMatched);
  
        System.out.println(matcher.find());

        String stringToBeMatched1 = "566676";

  
       Matcher matcher2 = pattern.matcher(stringToBeMatched1);

        System.out.println(matcher2.find());
    }
}
   