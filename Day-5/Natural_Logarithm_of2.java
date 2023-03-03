//program to compute the natural logarithm of 2, by adding up to n terms in the seires
import java.util.Scanner;
class Natural_Logarithm_of2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        double result=0;
        int symbol=1;
        for(double i=1;i<=n;i++){
            result+=(symbol/i);
            symbol*=-1;
         }
         System.out.print(result);
        
    }
}