/*program to print the following pattern
*
* *
* * *
* * * *
* * * 
* *
*
*/
import java.util.Scanner;
class Pascals_Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
             System.out.print("* ");
             System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++)
             System.out.print("* ");
             System.out.println();
        }
    }
} 
