/*program to print the following pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/
class Number_Pattern7{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--)
             System.out.print(j+" ");
             System.out.println();
        }
    }
}