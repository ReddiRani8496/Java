public class StringToInteger {
    public static void main(String[] args) {
        String str ="123";
        System.out.println(stringToInteger(str));
    }

    private static int stringToInteger(String str) {

        if(str.length() == 1)
            return str.charAt(0) - '0';

        return stringToInteger(str.substring(1)) + (str.charAt(0) * 10);
    }
}
