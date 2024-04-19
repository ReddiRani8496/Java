package ClassPractice;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countZeroes(n));
    }
    private static int countZeroes(int num) {
        if(num == 0)
            return 0;
       
        if(num % 10 == 0) {
            return 1+countZeroes(num/10);
        } else {
            return countZeroes(num/10);
        }
    }
}
