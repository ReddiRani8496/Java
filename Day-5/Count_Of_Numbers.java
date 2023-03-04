//program to count the number of zeros,positive  and negative numbers in a set of integers
import java.util.Scanner;
class Count_Of_Numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int zeros=0;
        int positiveNumbers=0;
        int negativeNumbers=0;
        do{
            System.out.print("enter the number:");
            int n=sc.nextInt();
            if(n==0)
              zeros++;
            else if(n>0)
             positiveNumbers++;
            else 
             negativeNumbers++;
             System.out.println("Do you want to enter one more number?(y/n):");
             char ch=sc.next().charAt(0);
             if(ch=='n'||ch=='N')
              break;
        }while(true);
        System.out.println("total zeors="+zeros+" total positive numbers="+positiveNumbers+" total negative numbers="+negativeNumbers);
    }
}