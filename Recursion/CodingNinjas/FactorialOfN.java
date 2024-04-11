import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    private static int factorial(int n) {

        if(n == 1) {    // Base case
            return 1;
        }

        return n * factorial(n-1);  // Recursive call
    }
}
