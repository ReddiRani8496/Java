/*program to print the following pattern
12345
 2345
  345
   45
    5
   45
  345
 2345
12345

*/

class Number_Pattern15{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++)
                 System.out.print(" ");
        for(int j=i;j<=n;j++)
        System.out.print(j);
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<n;j++)
        System.out.print(n-i-1);
        for(int k=n-1;k<=n;k++)
        System.out.print(k);
        System.out.println();
    }
    }
}