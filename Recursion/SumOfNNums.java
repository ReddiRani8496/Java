package Recursion;
import java.util.*;;

public class SumOfNNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(sumOfNNums(number));
    }
    private static int sumOfNNums(int number) {
        if(number == 0)
            return 0;
        return number + sumOfNNums(number-1);    
    }
}
