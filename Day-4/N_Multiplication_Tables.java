import java.util.Scanner;
class N_Multiplication_Tables{
    public static void main(String[] args){
        int j,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("insert upto the table number starting from 1: ");
        n=sc.nextInt();
        System.out.println("Multiplication table from 1 to "+n+"is: ");
        for(i=1;i<=10;i++){
            for(j=1;j<=n;j++){
                System.out.print(j+" X "+i+" = "+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}