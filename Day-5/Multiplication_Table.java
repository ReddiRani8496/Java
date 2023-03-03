//program to prompt the user to input a positive integer and then print the multiplication table of that number
import java.util.Scanner;
class Multiplication_Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=0;
        while((input=sc.nextInt())<1)
         System.out.println("Enter a positive number");
         for(int i=1;i<=10;i++)
          System.out.println(input+"X"+i+"="+(input*i));
    }
}