import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(possibleWays(n));
    }

    private static int possibleWays(int n) {
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return possibleWays(n-1)+possibleWays(n-2)+possibleWays(n-3);
    }
}
