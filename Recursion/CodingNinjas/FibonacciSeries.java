import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciSeries(n));
    }
     private static int fibonacciSeries(int n) {
        if(n==1 || n==0)
            return n;

        int fnum1 = fibonacciSeries(n-1);
        int fnum2 = fibonacciSeries(n-2);

        return fnum1 + fnum2;
    }
}
