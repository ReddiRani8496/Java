//program to check given number is palindrome or not
import java.util.Scanner;
class Palindrome{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  int sum=0,rev;
  int m=n;
  while(m!=0){
   rev=m%10;
   sum=sum*10+rev;
   m=m/10;
  }
  if(n==sum)
   System.out.println("palindrome");
  else
   System.out.println("not a palindrome");
 }
}
  