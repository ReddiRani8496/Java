/*program to print the following pattern
1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
class Number_Pattern16{
    public static void main(String[] args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
             System.out.print(j+" ");
             System.out.println();
        }
         for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        
    }
}