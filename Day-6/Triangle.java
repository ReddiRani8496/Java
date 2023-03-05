/*program to print the following pattern
   *
  * *
 *   *
*******
*/
class Triangle{
    public static void main(String[] args){
        int n=4;
       for(int i=1;i<=n-1;i++)
       System.out.print(" ");
       System.out.print("*");
       System.out.println();
       
       for(int i=2,l=1;i<=n-1;i++,l+=2){
        for(int j=1;j<=n-i;j++)
        System.out.print(" ");
    
        System.out.print("*");
        for(int k=1;k<=l;k++)
        System.out.print(" ");
        System.out.print("*");
         System.out.println();
       }
         for(int i=1;i<=(n*2)-1;i++)
        System.out.print("*");
        System.out.println();
    }
}