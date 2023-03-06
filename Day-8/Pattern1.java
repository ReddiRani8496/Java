/*
program to print the following pattern
1 2 3 4
1 2 3 * 
1 2 * * *
1 * * * * *

*/
class Pattern1{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++)
        System.out.print(i+" ");
        System.out.println();
        for(int i=2,l=1;i<=n;i++,l+=2){
            for(int k=1;k<=(n-i+1);k++)
            System.out.print(k+" ");
            for(int k=1;k<=l;k++)
            System.out.print("* ");
            System.out.println();
            
        }
    }
}