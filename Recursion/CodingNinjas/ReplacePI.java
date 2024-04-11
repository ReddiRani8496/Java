public class ReplacePI {
    public static void main(String[] args) {
        String str = "xpixpi";
        System.out.println( replace(str));
    }
    private static String replace(String str) {

        if(str.length() <= 1)
            return str;

        if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {

          return "3.14" + replace(str.substring(2));

        } else {

            return str.charAt(0) + replace(str.substring(1));
        }
    }
}
