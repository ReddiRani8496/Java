/*program to print the following pattern
1
10
101
1010
10101
101010

*/
class Number_Pattern9{
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<=n;i++){
            int start=1;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                if((start%i)==1)
                 start=0;
                 else 
                  start=1;
            }
            System.out.println();
        }
    }
}