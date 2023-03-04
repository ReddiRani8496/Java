//program that reads set of integers, and then print the sum of the even and odd integers
import java.util.Scanner;
class SumOf_Even_Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int even_Sum=0;
        int odd_Sum=0;
        do{
            System.out.println("enter the number:");
            int n=sc.nextInt();
            if(n%2==0)
             even_Sum++;
            else 
             odd_Sum++;
            System.out.println("Do you want to enter next number:(y/n)");
            char ch=sc.next().charAt(0);
            if(ch=='n'||ch=='N')
             break;

        }while(true);
        System.out.println("Even sum="+even_Sum+"\tOdd Sum="+odd_Sum);
    }
}