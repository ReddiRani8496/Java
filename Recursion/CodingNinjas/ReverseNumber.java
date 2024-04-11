import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        System.out.println(reverseNumber(n,ans));
    }

    private static int reverseNumber(int n,int ans) {
        if(n == 0) {
            return ans;
        }
        ans = ans*10+(n%10);
        return reverseNumber(n/10,ans);
    }
}
