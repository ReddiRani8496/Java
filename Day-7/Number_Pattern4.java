/*program to print the following pattern
   1
  212
 32123
4321234
 32123
  212
   1

*/
class Number_Pattern4{
    public static void main(String[] args){
        int n=8;
        for(int i=1;i<=n-1;i++)
        System.out.print(" ");
        System.out.print(1);
        System.out.println();
        for(int i=2;i<=n;i++){
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");
            for(int k=i;k>=1;k--)
             System.out.print(k);
             for(int k=2;k<=i;k++)
             System.out.print(k);
             System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++)
            System.out.print(" ");
            for(int k=n-i;k>=1;k--)
             System.out.print(k);
             for(int k=2;k<=(n-i);k++)
             System.out.print(k);
             System.out.println();
        }
    }
}