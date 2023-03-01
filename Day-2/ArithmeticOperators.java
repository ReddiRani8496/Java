import java.util.Scanner;
class ArithmeticOperators{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a value:");
  int a=sc.nextInt();
  System.out.println("enter b value:");
  int b=sc.nextInt();
  System.out.println("sum="+(a+b));//Adding the values of a and b
  System.out.println("sub="+(a-b));//Subtracting the values of a and b
  System.out.println("mul="+(a*b));//multiplying the values of a and b
  System.out.println("div="+(a/b));//dividing the values of a and b, result the quotient value
  System.out.println("modulus="+(a%b));//modulus operator, result the remainder value
  }
 }