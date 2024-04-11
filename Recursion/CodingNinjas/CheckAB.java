import java.util.Scanner;

public class CheckAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkAB(str));
    }

    private static boolean checkAB(String str) {
        if(str.isEmpty())
            return true;
        if(str.charAt(0)=='a') {
            if(str.substring(1).length()>1 && str.substring(1,3).equals("bb"))
                return checkAB(str.substring(3));
            else
                return checkAB(str.substring(1));
        }
        return false;
    }
}
