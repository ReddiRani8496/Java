import java.util.Scanner;

public class CountZeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countZeroes(n));
    }

    private static int countZeroes(int n) {

        if(n == 0)
            return 0;

        if( n%10 == 0) {

            return 1 + countZeroes(n/10);

        } else {

            return countZeroes(n/10);
        }
    }
}
