//program to n terms of odd natural numbers and thier sum
import java.util.Scanner;
class Sum_Of_OddNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of terms:");
        int n=sc.nextInt();
        n*=2;
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
               System.out.print(i+"\t");
               sum=sum+i;
        }
        }
        System.out.println("The sum of odd natural number upto "+n+" is: "+sum );
    }
}