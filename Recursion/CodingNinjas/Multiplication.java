import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println( multiply(n,m));
        int n1 = 10;
        double n3 = 10.4;
    }

   static int multiply(int num1, int num2) {

        if(num1 == 0 || num2 == 0)
            return 0;

        return num1 + multiply(num1,num2-1);
    }
}
