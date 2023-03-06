/* program to print the following pattern
A
B B
C C C
D D D D
*/
class Repeating_Alphabetic_Pattern{
    public static void main(String[] args){
        int n=4;
        char start='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            System.out.print(start+" ");
            System.out.println();
            start++;
        }
    }
}