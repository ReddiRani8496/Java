package Recursion;

import java.util.Scanner;

public class FirstNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        firstNNaturalNums(number);
    }
    public static void firstNNaturalNums(int number){
        if(number==0){
            return;
        }
        firstNNaturalNums(number-1);
        System.out.println(number);
    }
}
