import java.util.Scanner;
class RightSetBit{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  if((n&1)==1)
   System.out.println("set");
  else
   System.out.println("unset");
  }
  }