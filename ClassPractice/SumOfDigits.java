package ClassPractice;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 154;

        System.out.println(sumOfDigits(number));
    }

    private static int sumOfDigits(int num ) { // 154
        if(num == 0)
           return 0;
        return num%10 + sumOfDigits(num/10);  
    }
}
