/*
   1
  1 1
 1 2 1
1 3 3 1

*/
import java.util.Scanner;
class Number_Pattern3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        System.out.print(" ");
        System.out.println(1);
       
        for(int i=1;i<=n-1;i++){
            
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
             int start=1;
            for(int k=0;k<=i;k++){
            System.out.print(start+" ");
            start=start*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}