//program to find the value of one number raised to the power of another
import java.util.Scanner;
class Power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base value:");
        int b=sc.nextInt();
        System.out.println("enter the power value:");
        int p=sc.nextInt();
        int result=1;
        for(int i=1;i<=p;i++)
         result*=b;
        System.out.println("Result:"+result);
    }
}