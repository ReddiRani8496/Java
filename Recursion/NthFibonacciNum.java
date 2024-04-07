package Recursion;
import java.util.*;

public class NthFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }
    public static int fibonacci(int number) {
        if(number == 1 || number == 0)
            return number;
        int fNum = fibonacci(number-1);
        int sNum = fibonacci(number-2);
        return fNum+sNum;
    }
}
