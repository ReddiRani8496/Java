/* program to print the following triangle
****
*   *
*   *
*   *
*****
*   *
*   *
*   *
*   *

*/

import java.util.Scanner;
class Alphabet_Star_Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=(n/2)+1;i++)
        System.out.print("*");
        System.out.println();
      for(int i=1;i<=(n/2)-1;i++){
            System.out.print("*");
            for(int j=1;j<=(n/2)-1;j++)
            System.out.print(" ");
            System.out.print("*");
            System.out.println();
    }
        for(int i=1;i<=(n/2)+1;i++)
         System.out.print("*");
         System.out.println();
         /*
         for(int i=1;i<=(n/2);i++){
          System.out.print("*");
          for(int j=1;j<=(n/2)-1;j++)
            System.out.print(" ");
         System.out.print("*");
         System.out.println();
         }
           for(int i=1;i<=(n/2)+1;i++)
         System.out.print("*");
         System.out.println();
         */
         for(int i=2;i<=n/2;i++){
            System.out.print("*");
           // if((i-2)==0);
            //System.out.print("*");
            
           // else{
            for(int j=1;j<=(i-1);j++){
                System.out.print(" ");
               // System.out.print("*");
            }
            System.out.println("*");
            //System.out.println();
            

         }
        // System.out.println("*");

            
    }
}