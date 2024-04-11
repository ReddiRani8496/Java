import java.util.Scanner;

public class FactorialOfLogN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans =1;
        factorialOfLogN(n,ans);
    }

    private static void factorialOfLogN(int n,long ans) {


        if(n==0) {
            System.out.println((Math.log(ans))/(Math.log(2)));
            return;
        }
         factorialOfLogN(n-1,ans*n);
    }

}
