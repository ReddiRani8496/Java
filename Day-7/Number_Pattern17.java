/*program to print the following pattern
1111
1122
1333
4444
*/
class Number_Pattern17{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
             System.out.print(1);
             for(int k=1;k<=i;k++)
              System.out.print(i);
             System.out.println();
        }
    }
}