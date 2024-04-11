import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {

        // Base Case
        if(n < 10)
            return n;

        // Recursive Call
        return n%10 + sumOfDigits(n/10);
    }
}
