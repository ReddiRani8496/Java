package Recursion;
import java.util.Scanner;
public class FirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        printNNumbers(num);
    }

    public static void printNNumbers(int num) {  // 4 3 2 1
        if(num == 1) {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNNumbers(num-1);
//        System.out.println(num);
    }
}
