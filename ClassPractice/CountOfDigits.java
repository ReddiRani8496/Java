package ClassPractice;
import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(countDigits(number));
    }

    private static int countDigits(int num) {
        if(num == 0)
            return 0;
        
        return 1 + countDigits(num/10);

    }
    
}
