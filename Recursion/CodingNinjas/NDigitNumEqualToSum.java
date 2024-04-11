import java.util.Scanner;

public class NDigitNumEqualToSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        nDigitNumEqualToSum("",n,sum);
    }

    private static void nDigitNumEqualToSum(String ans,int n, int sum) {
        if(n > 0 && sum >= 0) {
            char d='0';
            if(ans.equals(""))
                d='1';

            while (d<='9') {
                nDigitNumEqualToSum(ans+d,n-1,sum-(d-'0'));
                d++;
            }
        }

        else {
            if(n==0 && sum==0) {
                System.out.println(ans);
            }
        }
    }
}
