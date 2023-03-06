/*program to print the following pattern
101010101
010101010
101010101
010101010
101010101

*/
class Number_Pattern8{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            int s=i%2;
            for(int j=1;j<=n;j++){
                System.out.print(s);
                if(s==1)
                 s=0;
                else
                 s=1;
            }
            System.out.println();
        }
    }
}