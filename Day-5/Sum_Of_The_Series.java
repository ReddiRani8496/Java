//program to caluculate the sum of following series where n is input by the user
import java.util.Scanner;
class Sum_Of_The_Series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        double result=0;
        for(double i=1;i<=n;i++){
            result+=(n/i);
         }
          System.out.print(result);
    }
}