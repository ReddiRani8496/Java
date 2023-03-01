//program to check given number is armstrong or not
import java.util.Scanner;
public class Armstrong{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  int sum=0,rev;
  int m=0;
  m=n;
  while(m!=0){
   rev=m%10;
   sum=sum+(rev*rev*rev);
   m=m/10;
  }
  if(n==sum)
   System.out.println("armstrong");
  else
   System.out.println("not armstrong");
  }
 }
  
