//program to find factorial of a number
import java.util.Scanner;
class Factorial{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  long f=1;
  while(n>1){
  f=f*n;
  n--;
  }
  System.out.println(f);
  }
  }