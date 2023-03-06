/* program to print the following pattern
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/
class Number_Pattern10{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++)
          System.out.print(i+" ");
            System.out.println();
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++)
            System.out.print(" ");
            for(int k=i;k<=n;k++)
            System.out.print(k+" "); 
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=(n-i-1);j++)
            System.out.print(" ");
            for(int k=(n-i);k<=n;k++)
            System.out.print(k+" ");
            System.out.println();
        }
        
    }
}