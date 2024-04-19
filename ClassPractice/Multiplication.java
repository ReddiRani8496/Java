package ClassPractice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(multiplication(num1,num2));
    }

    private static int multiplication(int num1, int num2) {
        if(num1 == 0 || num2==0) {
            return 0;
        }

        return num1 + multiplication(num1, num2-1);
    }
}
