//program to display the multiplication table
import java.util.Scanner;
class Multiplication_Of_Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Table to be caluculated: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print("\n"+n+" X "+i+" = "+(n*i));
        }
    }
}