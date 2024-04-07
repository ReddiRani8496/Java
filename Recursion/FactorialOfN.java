package Recursion;
import java.util.*;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int number) {
        if(number == 1)
            return 1;
        return number * factorial(number-1);    
    }
}
