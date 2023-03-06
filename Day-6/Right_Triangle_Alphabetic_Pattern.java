/*program to print the following pattern
A
A B
A B C
A B C D
A B C D E
*/
class Right_Triangle_Alphabetic_Pattern{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            char start='A';
            for(int j=1;j<=i;j++)
            System.out.print(start+++" ");
            System.out.println();
        }
    }
}