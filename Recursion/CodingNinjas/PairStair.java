public class PairStair {
    public static void main(String[] args) {
        String str = "helllo";
        System.out.println( pairStair(str));

    }

    private static String pairStair(String str) {
        if(str.length()<=1)
            return str;
        if(str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+pairStair(str.substring(1));
        else
            return str.charAt(0)+pairStair(str.substring(1));
    }
}
