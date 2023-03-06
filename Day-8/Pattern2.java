/*
program to print the following pattern
1*****
12****
123***
1234**
12345*
123456
*/
class Pattern2{
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            for(int k=n-i;k>=1;k--)
            System.out.print("* ");
            System.out.println();
            
        }
    }
}