/*program to print the following pattern
*******
 *   *
  * *
   *
*/
class Downward_Triangle{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=(n*2)-1;i++)
        System.out.print("*");
        System.out.println();
        for(int i=2,l=((n*2)-(i*i)-1);i<=n-1;i++,l-=2){
            for(int k=1;k<=(i-1);k++)
            System.out.print(" ");
            System.out.print("*");
           for(int j=1;j<=l;j++)
            System.out.print(" ");
            System.out.println("*");
        }
        for(int i=1;i<=n-1;i++)
        System.out.print(" ");
        System.out.println("*");
    }
}