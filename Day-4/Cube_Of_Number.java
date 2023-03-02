//program to display the cube of the number
import java.util.Scanner;
class Cube_Of_Number{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Input the number of terms:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        System.out.println("Number is: "+i+" and cube of the "+i+" is: "+(i*i*i));
       }
    }
}