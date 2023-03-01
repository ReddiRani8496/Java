//program to check given number is prime or not
import java.util.*;
class Prime_Or_Not{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  int count=0,i;
  for(i=1;i<=n;i++){
  if((n%i)==0)
   count++;
  }
  if(count==2)
   System.out.println("Prime");
  else
   System.out.println("not a prime");
  }
 }