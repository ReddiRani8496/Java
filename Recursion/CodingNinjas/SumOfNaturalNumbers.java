import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
    }

    private static int sumOfNaturalNumbers(int n) {
        if(n==1)
            return 1;
        return n+sumOfNaturalNumbers(n-1);
    }
}
