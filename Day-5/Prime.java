//program to check whether the number is prime or not
import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:")
        int n=sc.nextInt();
        if(n<2)
         System.out.println("Number is invalid, enter the valid number");
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                System.out.println("composite");
                return;
            }
        }
        System.out.println("prime");
    }
}