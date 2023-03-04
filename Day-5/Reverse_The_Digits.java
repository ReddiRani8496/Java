//program to reverse the digits in a number
import java.util.Scanner;
class Reverse_The_Digits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
         int result=0;
        for(int i=1;i<=n;i++){
       
        while(n>0){
            result=result*10+(n%10);
            n/=10;
        }
        }
        System.out.println("Reverse of the number is:"+result);
    }
}