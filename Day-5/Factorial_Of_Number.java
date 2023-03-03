//program to find the factorial value of any number entered 
import java.util.Scanner;
class Factorial_Of_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=0;
        int result=1;
        while((input=sc.nextInt())<1)
         System.out.println("enter a positive number");
        while(input!=0){
            result*=input;
            input--;
        }
        System.out.println(result);
    }
}