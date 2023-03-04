//program to add the two numbers , the loop should ask the user whether he/she wishes to perform the operation again
import java.util.Scanner;
class Sum_Of_The_Numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the first number:");
            int n1=sc.nextInt();
            System.out.print("Enter the second number:");
            int n2=sc.nextInt();
            System.out.println("the sum of two numbers is: "+(n1+n2));
            System.out.println("Do you want to continue?(y/n):");
            int ch=sc.next().charAt(0);
            if(ch=='n'||ch=='N')
             break;
        }while(true);
    }
}