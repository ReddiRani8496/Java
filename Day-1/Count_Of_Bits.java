import java.util.Scanner;
class Count_Of_Bits{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  int count=0;
  while(n>0){
   n=n&(n-1);
   count++;
  }
  System.out.println("count:"+count);
  }
  }