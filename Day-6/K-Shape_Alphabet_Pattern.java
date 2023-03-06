/*program to print the following pattern
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/
class K_Shape_Alphabet_Pattern{
    public static void main(String[] args){
        int n=6;
        for(int i=n;i>=1;i--){
            char start='A';
            for(int j=1;j<=i;j++)
            System.out.print(start+++" ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            char start='A';
            for(int k=1;k<=i;k++)
             System.out.print(start+++" ");
             System.out.println();
        }
    }
}