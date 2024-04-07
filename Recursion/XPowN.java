package Recursion;

import java.util.Scanner;

public class XPowN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int x = sc.nextInt();
        System.out.println(xPowN(n, x));
    }

    private static int xPowN(int x, int n) {
        if(n==0)
            return 1;
        return x * xPowN(x, n-1);    
    }
}
