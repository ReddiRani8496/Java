public class RemoveX {
    public static void main(String[] args) {
        String str = "xaxb";
        System.out.println( removeX(str));
    }

    private static String removeX(String str) {

        if(str.isEmpty())
            return "";

        if(str.charAt(0) == 'x')
            return removeX(str.substring(1));

        else
            return str.charAt(0) + removeX(str.substring(1));
    }
}
