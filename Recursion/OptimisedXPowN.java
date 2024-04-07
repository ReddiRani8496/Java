package Recursion;

import java.util.Scanner;

public class OptimisedXPowN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        powN(base, power);
    }
    private static int powN(int base, int power) {
        if(power == 0) {
            return 1;
        }
       // int halfSquare = powN(base, power/2) * powN(base, power/2); // we are calling the function 2 times

       int half = powN(base, power/2); // it is faster compared to previous call
       int halfSquare = half * half; 

        if(power % 2 != 0) {
            halfSquare =  halfSquare * base;
        }
        return halfSquare;
    }
}
