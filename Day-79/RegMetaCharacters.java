import java.util.regex.Pattern;

public class RegMetaCharacters {

    public static void  main(String[] args) {

        System.out.println(Pattern.matches("\\d", "9")); // Any digits, short of [0-9]

        System.out.println(Pattern.matches("[\\d]{3}","123"));

        System.out.println(Pattern.matches("\\d", "a"));

        System.out.println(Pattern.matches("\\D", "j")); // Any non-digit, short for [^0-9]

        System.out.println(Pattern.matches("\\D", "2"));

        System.out.println(Pattern.matches("\\s", "\t")); // Any whitespace character, short for [\t\n\x0B\f\r]

        System.out.println(Pattern.matches("\\S","r")); //Any non-whitespace character, short for [^\s]

        System.out.println(Pattern.matches("\\w*", "javaG9_8")); //Any word character, short for [a-zA-Z_0-9]

        System.out.println(Pattern.matches("\\W", "@")); //Any non-word character, short for [^\w]

    }
}



