package ClassPractice;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 734;

        System.out.println(sumOfDigits(number));
    }

    private static int sumOfDigits(int num) {
        if(num == 0)
           return 0;
        return num%10 + sumOfDigits(num/10);  
    }
}
