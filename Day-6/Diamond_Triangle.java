/*program to print the following pattern
   *
  * *
 *   *
*     *
 *   *
  * *
   *

   */
import java.util.Scanner;
class Diamond_Triangle{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of rows:");
       int n=sc.nextInt();
       for(int i=1;i<=n-1;i++)
       System.out.print(" ");
        System.out.print("*");
        System.out.println(); 
       for(int i=2,l=1;i<=n;i++,l+=2){
        for(int j=1;j<=n-i;j++)
        System.out.print(" ");
        System.out.print("*");
        for(int k=1;k<=l;k++)
         System.out.print(" ");
         System.out.print("*");
         System.out.println();
       }
       for(int i=2,l=(n*2)-(i*i)-1;i<n;i++,l-=2){
        for(int j=1;j<=i-1;j++)
         System.out.print(" ");
         System.out.print("*");
         for(int k=1;k<=l;k++)
         System.out.print(" ");
         System.out.print("*");
         System.out.println();
         
       }
       for(int i=1;i<=n-1;i++)
         System.out.print(" ");
         System.out.println("*");
       
    }
}
