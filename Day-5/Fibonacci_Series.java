//program to print fibonaci series of n terms 
import java.util.Scanner;
class Fibonacci_Series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int result=0;
        for(int i=1;i<=n;i++){
            System.out.print(n1+"\t");
            result=n1+n2;
            n1=n2;
            n2=result;
           
        }
        
    }
}