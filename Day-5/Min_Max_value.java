//program to enter the numbers till teh user wants and print max and min values
import java.util.Scanner;
class Min_Max_Value{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    char ch;
    do{
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(n>max)
         max=n;
        if(n<min)
         min=n;
         System.out.println("Do you want to continue(y/n):");
         ch=sc.next().charAt(0);
         if(ch=='n'||ch=='N')
         break;
    }while(true);
    System.out.println(min+"\t"+max);
    }
}