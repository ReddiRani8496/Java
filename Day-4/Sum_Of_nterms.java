//program to display sum of n terms of natural numbers
import java.util.Scanner;
class Sum_Of_nterms{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Test Data: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of n terms of natural numbers is: "+sum);
    }
}